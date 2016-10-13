package com.springmvcdemo.controller;

import com.springmvcdemo.model.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangmu126 on 2016/10/1.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(UserVo userVo) {
        return "index";
    }
}
