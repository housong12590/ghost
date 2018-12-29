package com.spring.ghost.controller;

import com.spring.ghost.dto.MakerResp;
import com.spring.ghost.exception.UserException;
import com.spring.ghost.model.Users;
import com.spring.ghost.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(@RequestBody Users user, BindingResult result) {
        try {
            userService.register(user);
        } catch (UserException e) {
            return MakerResp.failed(e.getErrCode(), e.getMessage());
        }
        return MakerResp.success(user);
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody Users user, BindingResult result) {
        try {
            userService.login(user);
        } catch (UserException e) {
            return MakerResp.failed(e.getErrCode(), e.getMessage());
        }
        return MakerResp.failed();
    }


}
