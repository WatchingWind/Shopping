package com.shop.portal.service.impl;

import com.shop.mbg.dao.UserMapper;
import com.shop.mbg.model.User;
import com.shop.portal.redis.RedisService;
import com.shop.portal.redis.RedisTokenKey;
import com.shop.portal.service.UmsMemberService;
import com.shop.portal.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

  @Autowired
  RedisTokenKey redisTokenKey;
  @Autowired
  UserMapper userMapper;
  @Autowired
  RedisService redisService;

  @Override
  public String login(HttpServletResponse response, User user) {
    User result = userMapper.selectByUId(user.getuId());
    System.out.println("result"+result);
    if (result != null && result.getPassword().equals(user.getPassword().trim())) {
      String token = UUIDUtil.uuid(); //通过UUID工具类生成散列字符串
      System.out.println("uuid" + token);
      redisService.set(token,redisTokenKey.getTokenExpiredTime(),user);
      System.out.println("redis");
      setCookie(response,"token",token);
      return token;
    } else {
      return null;
    }
  }

  private void setCookie(HttpServletResponse resp, String key, String value){
    Cookie cookie = new Cookie(key,value);
    cookie.setMaxAge(redisTokenKey.getTokenExpiredTime());
    cookie.setPath("/");  //当客户端请求该路径的子路径时会带cookie  也即对该路径及子路径可见
    resp.addCookie(cookie);
  }

  //这里牵涉到事务的继承性 inherited
  @Override
  public boolean register(HttpServletResponse response,User user) {
    try{
      userMapper.insert(user);
    } catch (Exception e) {
      return false;
    }
    String token = UUIDUtil.uuid(); //通过UUID工具类生成散列字符串
    System.out.println("uuid" + token);
    redisService.set(token,redisTokenKey.getTokenExpiredTime(),user);
    System.out.println("redis");
    setCookie(response,"token",token);
    return true;
  }

  @Override
  public String generateAuthCode() {
    return null;
  }

  @Override
  public void updatePassword() {

  }
}