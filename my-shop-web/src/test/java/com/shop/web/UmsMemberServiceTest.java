package com.shop.web;

import com.shop.mbg.model.User;
import com.shop.portal.service.UmsMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UmsMemberServiceTest {
    @Autowired
    UmsMemberService umsMemberService;
    @Autowired
    HttpServletResponse response;

    @Test
    public void UmsMembertest() {
        User user = new User();
        user.setuId(100003489L);
        user.setPassword("888");
        user.setEmail("1992353533@qq.com");

        if (umsMemberService.register(response,user)) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
