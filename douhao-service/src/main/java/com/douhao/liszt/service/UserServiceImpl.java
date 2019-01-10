package com.douhao.liszt.service;

import com.douhao.liszt.dao.UserDAO;
import com.douhao.liszt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> list() {
        return userDAO.findAll();
    }
}