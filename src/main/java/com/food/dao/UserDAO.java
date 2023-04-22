package com.food.dao;

import com.food.entity.User;
import com.food.entity.heal;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    //food 注册
    void save(@Param("username") String username,@Param("password") String password,
              @Param("address") String address,@Param("phone") String phone);

    User login(@Param("username") String username, @Param("password") String password);

    heal query(@Param("username") String username);

    User check(@Param("username") String username);

    void bad(@Param("username") String username,@Param("period") int period);

    void better(@Param("username") String username);


}
