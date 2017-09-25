package com.xgy.myspringredis.service;


import com.xgy.myspringredis.model.User;

import java.util.List;

/**
 * Created by hadoop on 2017/9/24.
 */
public interface UserService {
    void insertUser(User user);
    User getUser(Integer id);
}
