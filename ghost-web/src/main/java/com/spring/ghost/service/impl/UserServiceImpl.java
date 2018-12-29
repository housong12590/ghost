package com.spring.ghost.service.impl;


import com.spring.ghost.exception.UserException;
import com.spring.ghost.mapper.UsersMapper;
import com.spring.ghost.model.Users;
import com.spring.ghost.model.UsersExample;
import com.spring.ghost.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersMapper userMapper;

    @Override
    public boolean register(Users user) throws UserException {
        UsersExample example = new UsersExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        example.or().andMobileEqualTo(user.getMobile());
        List<Users> users = userMapper.selectByExample(example);
        if (users.isEmpty()) {
            userMapper.insert(user);
        }

        return true;
    }

    @Override
    public Users login(Users user) throws UserException {

        return null;
    }
}
