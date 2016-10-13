package com.springmvcdemo.service.impl;

import com.springmvcdemo.dao.UserDao;
import com.springmvcdemo.model.UserVo;
import com.springmvcdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangmu126 on 2016/10/1.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    public UserVo getByUser(UserVo user){
        return userDao.getByUser(user);
    }
}
