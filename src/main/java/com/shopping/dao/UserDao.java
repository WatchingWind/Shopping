package com.shopping.dao;

import com.shopping.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select phone,password from user u where u.phone = #{phone}")
    public User signIn(@Param("phone")String phone);
}
