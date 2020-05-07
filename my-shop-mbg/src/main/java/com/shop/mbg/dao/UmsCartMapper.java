package com.shop.mbg.dao;

import com.shop.mbg.vo.UmsCartVo;

import java.util.List;

public interface UmsCartMapper {
    public List<UmsCartVo> getCart(Long uId);

    int delGoods(Long uId, Integer pId);

    int setGoodsNumber(Long uId, Integer pId, Integer num);

    Integer getGoodsAmount(Long uId);
}