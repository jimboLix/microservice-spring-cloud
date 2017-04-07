package com.jimbo.cloud.Service;

import com.jimbo.cloud.entity.User;

/**
 * @author ruihui.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/4/6
 */
public interface UserService {
    User getUserById( Integer id);
    void save(User u);
}
