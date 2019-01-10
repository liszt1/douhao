package com.douhao.liszt.service;

import com.douhao.liszt.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService  {

    public List<User> list();
}