package com.jimbo.cloud.service;

import com.jimbo.cloud.MicroserviceSpringCloudApplicationTests;
import com.jimbo.cloud.Service.UserService;
import com.jimbo.cloud.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ruihui.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/4/6
 */
public class UserServiceTest extends MicroserviceSpringCloudApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void saveTest(){
        User u = new User();
        u.setUserName("2282402253");
        u.setPassWord("123");
        userService.save(u);
    }
    @Autowired
    public void getUserByIdTest(){
        userService.getUserById(1);
    }
}
