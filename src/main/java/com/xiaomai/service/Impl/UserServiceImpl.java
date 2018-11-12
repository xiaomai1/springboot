package com.xiaomai.service.Impl;

import com.xiaomai.dao.UserDao;
import com.xiaomai.entity.User;
import com.xiaomai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userdao;
    // alt + enter  enter  enter  把勾去掉
    @Override
    public List<User> queryAll() {
        List<User> users = userdao.queryAll();
        return users;
    }
}
