package com.itheima.controller;


import com.itheima.service.UserService;
import com.itheima.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: day72_vue_user
 * @description:
 * @author: NeoLuo
 * @create: 2019-05-15 21:23
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 使用restful接收id属性值
     * @param user
     */
    @RequestMapping("/findOne/{id}")
    public User findOne(@PathVariable("id") Integer id) {
        return userService.findOne(id);
    }

    @RequestMapping("/update")
    public void update(User user) {
        userService.update(user);
    }

//    /**
//     * 使用传统接收id属性值
//     * @param id
//     * @return
//     */
//    @RequestMapping("/findOne")
//    public User findOne(Integer id) {
//        return userService.findOne(id);
//    }
}
