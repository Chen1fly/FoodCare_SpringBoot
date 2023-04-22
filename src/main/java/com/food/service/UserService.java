package com.food.service;

import com.food.entity.User;
import com.food.entity.heal;

public interface UserService {
    //food 注册
    void register(String username, String password,String address,String phone);

    //food 登录
    User login(String username, String password);

    //查询状态
    heal query(String username);

    User check(String username);

    void bad(String username,int period);

    void better(String username);
}
