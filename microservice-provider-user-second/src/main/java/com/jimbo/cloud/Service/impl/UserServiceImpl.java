package com.jimbo.cloud.Service.impl;

import com.jimbo.cloud.Service.UserService;
import com.jimbo.cloud.dao.UserDao;
import com.jimbo.cloud.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author ruihui.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/4/6
 */
@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    @Transactional(readOnly = true)
    public User getUserById(Integer id) {
        if(null != id){
            return userDao.getUserById(id);
        }
        return null;
    }

    @Override
    public void save(User u) {
        if(null != u){
            this.userDao.save(u);
        }
    }
}
