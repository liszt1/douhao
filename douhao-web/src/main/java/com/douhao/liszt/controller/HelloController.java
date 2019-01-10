package com.douhao.liszt.controller;

import com.douhao.liszt.pojo.User;
import com.douhao.liszt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class HelloController {


    @Autowired
    UserService userService;

    @GetMapping("list")
    public List<User> list() {
            return userService.list();
    }

}
