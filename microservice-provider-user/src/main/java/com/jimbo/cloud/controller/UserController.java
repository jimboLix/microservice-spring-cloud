package com.jimbo.cloud.controller;

import com.jimbo.cloud.Service.UserService;
import com.jimbo.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruihui.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/4/6
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable(value = "id") Integer id){
        return userService.getUserById(id);
    }
}
