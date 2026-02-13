package com.cheers.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private Integer id;

    /**
     * 描述
     */
    private String description;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 图片URL
     */
    private String picUrl;

    /**
     * 价格
     */
    private Double price;

    /**
     * 穿搭频率
     */
    private Integer freq;

    /**
     * 购买时间
     */
    private Date buyAt;

}
