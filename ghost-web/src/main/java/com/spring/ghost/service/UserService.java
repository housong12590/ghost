package com.spring.ghost.service;

import com.spring.ghost.exception.UserException;
import com.spring.ghost.model.Users;

public interface UserService {

    boolean register(Users user) throws UserException;

    Users login(String username, String password) throws UserException;
}
