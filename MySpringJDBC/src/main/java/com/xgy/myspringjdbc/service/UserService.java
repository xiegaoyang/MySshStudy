package com.xgy.myspringjdbc.service;

import com.xgy.myspringjdbc.model.User;

import java.util.List;

/**
 * Created by hadoop on 2017/9/24.
 */
public interface UserService {
    void insertUser(User user);
    User getUser(Integer id);
    List<User> getUsers();
}
