package com.springmvcdemo.controller;

import com.springmvcdemo.model.UserVo;
import com.springmvcdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by zhangmu126 on 2016/10/1.
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String toIndex(UserVo userVo, Model model) {
        UserVo user = userService.getByUser(userVo);
        model.addAttribute("user", user);
        return "showUser";
    }
}