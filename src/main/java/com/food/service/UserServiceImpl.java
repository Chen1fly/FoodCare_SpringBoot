package com.food.service;

import com.food.dao.UserDAO;
import com.food.entity.User;
import com.food.entity.heal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public void register(String username, String password,String address,String phone) {
        //food注册
        userDAO.save(username,password,address,phone);
    }
    @Override
    public User login(String username, String password) {

        return userDAO.login(username, password);
    }
    public heal query(String username){
        return userDAO.query(username);
    }
    public User check(String username){
        return userDAO.check(username);
    }

    public void bad(String username,int period){
        userDAO.bad(username,period);
    }

    public void better(String username){
        userDAO.better(username);
    }
}
