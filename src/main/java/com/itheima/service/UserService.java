package com.itheima.service;

import com.itheima.user.User;

import java.util.List;

/**
 * @program: day72_vue_user
 * @description: 业务层
 * @author: NeoLuo
 * @create: 2019-05-15 20:59
 **/
public interface UserService {
    public List<User> findAll();

    public User findOne(int id);

    public void update(User user);
}
