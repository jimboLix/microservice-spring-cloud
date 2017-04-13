package com.jimbo.cloud.controller;

import com.jimbo.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liruihui
 * @version 1.0
 * @date 2017/4/8
 * @email jimboLix@163.com
 */
@RestController
@RequestMapping("/movie")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(value = "id") Integer id){
       return restTemplate.getForObject("http://userProvider/user/getUser/"+id,User.class);
    }
}
