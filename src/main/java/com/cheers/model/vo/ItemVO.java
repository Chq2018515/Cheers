package com.cheers.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName(value ="item")
public class ItemVO implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Object id;

    /**
     * 描述
     */
    private String desc;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 价格
     */
    private Double price;

    /**
     * 穿搭频率
     */
    private Object freq;

    /**
     * 购买时间
     */
    private Date buyAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}