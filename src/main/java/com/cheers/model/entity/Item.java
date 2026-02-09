package com.cheers.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 单品
 * @TableName item
 */
@TableName(value ="item")
public class Item implements Serializable {
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
    private Object freq;

    /**
     * 购买时间
     */
    private Date buyAt;

    /**
     * 备用1
     */
    private String extra1;

    /**
     * 备用2
     */
    private String extra2;

    /**
     * 备用3
     */
    private String extra3;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Object getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 图片URL
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 图片URL
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 穿搭频率
     */
    public Object getFreq() {
        return freq;
    }

    /**
     * 穿搭频率
     */
    public void setFreq(Object freq) {
        this.freq = freq;
    }

    /**
     * 购买时间
     */
    public Date getBuyAt() {
        return buyAt;
    }

    /**
     * 购买时间
     */
    public void setBuyAt(Date buyAt) {
        this.buyAt = buyAt;
    }

    /**
     * 备用1
     */
    public String getExtra1() {
        return extra1;
    }

    /**
     * 备用1
     */
    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    /**
     * 备用2
     */
    public String getExtra2() {
        return extra2;
    }

    /**
     * 备用2
     */
    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    /**
     * 备用3
     */
    public String getExtra3() {
        return extra3;
    }

    /**
     * 备用3
     */
    public void setExtra3(String extra3) {
        this.extra3 = extra3;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getFreq() == null ? other.getFreq() == null : this.getFreq().equals(other.getFreq()))
            && (this.getBuyAt() == null ? other.getBuyAt() == null : this.getBuyAt().equals(other.getBuyAt()))
            && (this.getExtra1() == null ? other.getExtra1() == null : this.getExtra1().equals(other.getExtra1()))
            && (this.getExtra2() == null ? other.getExtra2() == null : this.getExtra2().equals(other.getExtra2()))
            && (this.getExtra3() == null ? other.getExtra3() == null : this.getExtra3().equals(other.getExtra3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getFreq() == null) ? 0 : getFreq().hashCode());
        result = prime * result + ((getBuyAt() == null) ? 0 : getBuyAt().hashCode());
        result = prime * result + ((getExtra1() == null) ? 0 : getExtra1().hashCode());
        result = prime * result + ((getExtra2() == null) ? 0 : getExtra2().hashCode());
        result = prime * result + ((getExtra3() == null) ? 0 : getExtra3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", desc=").append(desc);
        sb.append(", type=").append(type);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", price=").append(price);
        sb.append(", freq=").append(freq);
        sb.append(", buyAt=").append(buyAt);
        sb.append(", extra1=").append(extra1);
        sb.append(", extra2=").append(extra2);
        sb.append(", extra3=").append(extra3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}