package com.jimbo.cloud.entity;

/**
 * @author liruihui
 * @version 1.0
 * @date 2017/4/8
 * @email jimboLix@163.com
 */
public class User {
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
