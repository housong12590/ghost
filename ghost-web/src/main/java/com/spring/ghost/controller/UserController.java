package com.spring.ghost.controller;

import com.spring.ghost.bean.LoginParam;
import com.spring.ghost.dto.MakerResp;
import com.spring.ghost.exception.UserException;
import com.spring.ghost.model.Users;
import com.spring.ghost.service.UserService;

import com.spring.ghost.utils.ClassMergeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(@RequestBody LoginParam param) {
        Users user = ClassMergeUtils.copyProperties(Users.class, param);
        try {
            userService.register(user);
        } catch (UserException e) {
            return MakerResp.failed(e.getErrCode(), e.getMessage());
        }
        return MakerResp.success(user);
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody LoginParam param, BindingResult result) {
        try {
            Users user = userService.login(param.getUsername(), param.getPassword());
            return MakerResp.success(user);
        } catch (UserException e) {
            return MakerResp.failed(e.getErrCode(), e.getMessage());
        }
    }
}
