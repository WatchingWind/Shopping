package com.shop.mbg.vo;



import com.shop.mbg.config.PicturePrefix;

import java.math.BigDecimal;

public class UmsCartVo {
    private String picture;
    private String attribute;
    private BigDecimal price;
    private int count;
    private Long uId;
    private Integer pId;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    @Override
    public String toString() {
        return "UmsCartVo{" +
                "picture='" + picture + '\'' +
                ", attribute='" + attribute + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", uId=" + uId +
                '}';
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = PicturePrefix.PREFIX + picture;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }
}
