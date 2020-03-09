package com.shopping.services.impl;

import com.shopping.dao.UserDao;
import com.shopping.domain.User;
import com.shopping.result.ILoginResult;
import com.shopping.services.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginService implements ILoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public int singIn(User user) {
        System.out.println(Thread.currentThread().getClass().getName()+":"+user.getPhone());

        System.out.println("=======================");
        System.out.println(userDao.signIn(user.getPhone()));

        User select =  userDao.signIn(user.getPhone());
        /*System.out.println(select.toString());*/
        if(select == null){
            return 0;
        } else if (!user.getPassword().trim().equals(select.getPassword())) {
            return 1;
        } else {
            return 2;
        }
    }



}
