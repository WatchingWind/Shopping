package com.shop.portal.service.impl;

import com.shop.mbg.dao.UmsCartMapper;
import com.shop.mbg.model.User;
import com.shop.mbg.vo.UmsCartVo;
import com.shop.portal.redis.RedisService;
import com.shop.portal.redis.RedisTokenKey;
import com.shop.portal.service.UmsCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class UmsCartServiceImpl implements UmsCartService{
    @Autowired
    UmsCartMapper umsCartMapper;
    @Autowired
    RedisTokenKey redisTokenKey;
    @Autowired
    RedisService redisService;

    @Override
    public List<UmsCartVo> cartInfo(HttpServletRequest request) {
        String token = getToken(request);
        if (token == null) {
            return null;
        }
        User curUser = redisService.get(token, User.class);
        List<UmsCartVo> carts = umsCartMapper.getCart(curUser.getuId());

        return carts;
    }

    @Override
    public boolean delGoods(Long uId, Integer pId) {
        int affectColumns = umsCartMapper.delGoods(uId, pId);
        if (affectColumns == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setGoodsNumber(Long uId, Integer pId, Integer num) {
        int affectColumns = umsCartMapper.setGoodsNumber(uId, pId, num);

        return affectColumns > 0 ;
    }

    public String getToken(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if  (cookies == null) {
            System.out.println("cookie为空！！");
            return null;
        }
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals(redisTokenKey.getToken())) {
                return cookie.getValue();
            }
        }

        return null;
    }

    @Override
    public Integer getGoodsAmount(Long uId) {
        return umsCartMapper.getGoodsAmount(uId);
    }
}
