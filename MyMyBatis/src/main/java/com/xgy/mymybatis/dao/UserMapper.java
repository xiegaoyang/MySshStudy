package com.xgy.mymybatis.dao;

import com.xgy.mymybatis.model.User;

/**
 * Created by hadoop on 2017/9/21.
 */
public interface UserMapper {

    void insertUser(User user);

    User getUser(Integer id);

}
