package com.xgy.myspringmybatis.dao;

import com.xgy.myspringmybatis.model.User;

/**
 * Created by hadoop on 2017/9/21.
 */
public interface UserMapper {

    void insertUser(User user);

    User getUser(Integer id);

}
