package com.springmvcdemo.dao;

import com.springmvcdemo.model.UserVo;

/**
 * Created by zhangmu126 on 2016/10/1.
 */
public interface UserDao {
    UserVo getByUser(UserVo user);
}
