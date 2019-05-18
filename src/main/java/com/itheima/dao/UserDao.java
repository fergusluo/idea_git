package com.itheima.dao;

import com.itheima.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: day72_vue_user
 * @description: 持久层
 * @author: NeoLuo
 * @create: 2019-05-15 20:56
 **/
public interface UserDao extends JpaRepository<User,Integer> {
}

