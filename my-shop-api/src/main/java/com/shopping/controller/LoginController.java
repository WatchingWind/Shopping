package com.shopping.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shopping.domain.User;
import com.shopping.result.LoginResult;
import com.shopping.services.impl.LoginService;
import com.shopping.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    //登录
    @RequestMapping(value = "/signIn")
    @ResponseBody
    public String signIn1(@Valid UserVo userVo){
        System.out.println(userVo);
        User user = new User();

        user.setPhone(userVo.getPhone());
        user.setPassword(userVo.getPassword());

        System.out.println(user.getPhone());
        System.out.println(user.getPassword());
       /* int loginRes= loginService.singIn(user);*/

        System.out.println("\"");
        String phone = "18373320883";
        String password = "123456";
        int loginRes;
        if(userVo.getPhone().trim().equals(phone)  && userVo.getPassword().trim().equals(password)){
            loginRes = 2;
        }else{
            loginRes = 1;
        }

        if(loginRes == 2 ){
            return  JSON.toJSONString(LoginResult.SUCCESS);
        }else if(loginRes == 1){
            return JSON.toJSONString(LoginResult.PASSWORD_ERROR);
        }else {
            return JSON.toJSONString(LoginResult.COUNT_NOTEXIST);
        }
    }
    //登录
    @RequestMapping(value = "signIn1",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String signIn(@RequestBody JSONObject jsonpObject,HttpServletRequest req){
        System.out.println(jsonpObject.toJSONString());
        User user = jsonpObject.toJavaObject(User.class);
        System.out.println(user.getPhone());
        System.out.println(user.getPassword());
        int loginRes= loginService.singIn(user);
        if(loginRes == 2 ){
            return  JSON.toJSONString(LoginResult.SUCCESS);
        }else if(loginRes == 1){
            return JSON.toJSONString(LoginResult.PASSWORD_ERROR);
        }else {
            return JSON.toJSONString(LoginResult.COUNT_NOTEXIST);
        }
    }

    //注册
    @RequestMapping("signUp")
    public void signUp(String count,String password,String imag){

    }

    //注销
    @RequestMapping("signOut")
    public void signOut(){

    }
}
