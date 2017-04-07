package com.jimbo.cloud.entity;

import java.io.Serializable;

/**
 * @author ruihui.li
 * @version V1.0
 * @Description: 用户实体类
 * @date 2017/4/6
 */
public class User implements Serializable{
    private static final long serialVersionUID = -8842480480952655332L;
    private Integer id;
    private String userName;
    private String passWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
