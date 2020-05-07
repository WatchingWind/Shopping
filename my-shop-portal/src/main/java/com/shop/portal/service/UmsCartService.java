package com.shop.portal.service;


import com.shop.mbg.vo.UmsCartVo;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UmsCartService {
    List<UmsCartVo> cartInfo(HttpServletRequest request);

    @Transactional
    boolean delGoods(Long uId, Integer pId);

    @Transactional
    boolean setGoodsNumber(Long uId, Integer pId, Integer num);

    String getToken(HttpServletRequest request);

    Integer getGoodsAmount(Long uId);
}
