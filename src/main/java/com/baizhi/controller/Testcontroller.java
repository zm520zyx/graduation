package com.baizhi.controller;


import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Test")
public class Testcontroller {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("test")
    public List<User> test() {
        System.out.println("我是贺俊杰");
        List<User> users = userMapper.selectAll();
        return users;
    }

    public void m1() {
        System.out.println("贺俊杰");
        System.out.println("大上海");
}
}
