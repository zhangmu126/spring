package com.springmvcdemo.service;

import com.springmvcdemo.model.UserVo;

/**
 * Created by zhangmu126 on 2016/10/1.
 */
public interface IUserService {
    UserVo  getByUser(UserVo user);
}
