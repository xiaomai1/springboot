package com.xiaomai.dao;

import com.xiaomai.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryAll();
    void save(User user);
}
