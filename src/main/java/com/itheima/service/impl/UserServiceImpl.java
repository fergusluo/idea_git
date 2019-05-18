package com.itheima.service.impl;


import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import com.itheima.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: day72_vue_user
 * @description: service接口实现类
 * @author: NeoLuo
 * @create: 2019-05-15 21:15
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }
}
