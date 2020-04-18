package com.shop.portal.service.impl;

import com.shop.mbg.model.User;
import com.shop.portal.service.UmsMemberService;
import org.springframework.stereotype.Service;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {



  @Override
  public String login(User user) {
    return null;
  }

  //这里牵涉到事务的继承性 inherited
  @Override
  public User register(User user) {
    return null;
  }

  @Override
  public String generateAuthCode() {
    return null;
  }

  @Override
  public void updatePassword() {

  }
}