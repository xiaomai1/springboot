package com.xiaomai.controller;

import com.xiaomai.entity.User;
import com.xiaomai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/queryAll")
    public List<User> queryAll(){
        List<User> users = userService.queryAll();
        return users;
    }
}
