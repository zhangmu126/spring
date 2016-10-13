package com.springmvcdemo.model;

/**
 * Created by zhangmu126 on 2016/10/1.
 * 用户实体
 */
public class UserVo {
        private String userName;
    private String userPwd;

    public UserVo() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
