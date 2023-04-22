package com.food.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.food.entity.User;
import com.food.entity.heal;
import com.food.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Autowired
    private UserService userService;
    //food登录
    @PostMapping(value = "/login")
    public StringBuffer login(String username, String password) {
        try{
            User user1 = userService.login(username, password);
            if (user1!=null){
                heal heal = userService.query(username);
                ObjectMapper om = new ObjectMapper();
                StringBuffer heal_str =new StringBuffer(om.writeValueAsString(heal));
                heal_str.insert(1,"\"statu\":\"ok\",");
                System.out.println("jsonStr="+heal_str);
                return heal_str;
            }
            StringBuffer error =new StringBuffer("error");

            return error;
        }catch (Exception e){
            StringBuffer error =new StringBuffer("error");

            return error;
        }
    }
    //food注册
    @PostMapping(value = "/register")
    public String register(String username, String password, String address, String phone){
        try {
            userService.register(username,password,address,phone);
            return "ok";
        }catch (Exception e){
            return "error";
        }
    }
    @PostMapping(value = "/check")
    public StringBuffer check(String username) {
        try{
            heal heal = userService.query(username);
            ObjectMapper om = new ObjectMapper();
            StringBuffer heal_str =new StringBuffer(om.writeValueAsString(heal));
            if (heal_str==null){
                StringBuffer error =new StringBuffer("error");
                return error;
            }
            return heal_str;
        }catch (Exception e){
            StringBuffer error =new StringBuffer("error");
            return error;
        }
    }

    @PostMapping(value = "/check_info")
    public StringBuffer check_info(String username) {
        try{
            User user = userService.check(username);
            ObjectMapper om = new ObjectMapper();
            StringBuffer user_str =new StringBuffer(om.writeValueAsString(user));
            if (user_str==null){
                StringBuffer error =new StringBuffer("error");
                return error;
            }
            return user_str;
        }catch (Exception e){
            StringBuffer error =new StringBuffer("error");
            return error;
        }
    }

    @PostMapping(value = "/bad")
    public void bad(String username) {
        try{
            heal heal = userService.query(username);
            int period = heal.getPeriod()+1;
            userService.bad(username,period);
        }catch (Exception e){

        }
    }

    @PostMapping(value = "/better")
    public void better(String username) {
        try{
            userService.better(username);
        }catch (Exception e){
        }
    }
}
