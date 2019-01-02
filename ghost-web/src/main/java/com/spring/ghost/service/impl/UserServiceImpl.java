package com.spring.ghost.service.impl;


import com.spring.ghost.exception.UserException;
import com.spring.ghost.mapper.UsersMapper;
import com.spring.ghost.model.Users;
import com.spring.ghost.model.UsersExample;
import com.spring.ghost.service.UserService;

import com.spring.ghost.utils.StringUtils;
import io.netty.util.internal.StringUtil;
import org.attoparser.util.TextUtil;
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
        List<Users> users = userMapper.selectByExample(example);
        if (users.isEmpty()) {
            userMapper.insert(user);
            return true;
        }
        for (Users item : users) {
            if (item.getUsername().equals(user.getUsername())) {
                throw new UserException("用户名已存在");
            }
            if (item.getMobile().equals(user.getMobile())) {
                throw new UserException("手机号已存在");
            }
        }
        throw new UserException("注册失败");
    }

    @Override
    public Users login(String username, String password) throws UserException {
        UsersExample example = new UsersExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Users> users = userMapper.selectByExample(example);
        if (users.isEmpty()) {
            throw new UserException("用户不存在");
        }
        Users item = users.get(0);
        if (!item.getPassword().equals(password)) {
            throw new UserException("密码错误");
        }
        return item;
    }
}
