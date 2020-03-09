package com.shopping.vo;

import com.shopping.validator.IsMobile;

import javax.validation.constraints.NotNull;

public class UserVo {
    @IsMobile
    private String phone;
    @NotNull
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
