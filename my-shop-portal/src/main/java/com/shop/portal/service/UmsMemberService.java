package com.shop.portal.service;

import com.shop.mbg.model.User;
import org.springframework.transaction.annotation.Transactional;

public interface UmsMemberService {

    /**
     *用户登录
     */
     @Transactional
    String  login(User user);

    /**
     * 用户注册
     */
     @Transactional
    User register(User user);

    /**
     * 生成验证码
     * @return
     */
    String generateAuthCode();

    /**
     * 修改密码
     */
    @Transactional
    void updatePassword();

}
