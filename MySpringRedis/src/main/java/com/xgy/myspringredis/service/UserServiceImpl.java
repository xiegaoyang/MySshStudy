package com.xgy.myspringredis.service;

import com.xgy.myspringredis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;


/**
 * Created by hadoop on 2017/9/24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RedisTemplate jedisTemplate;

    public void insertUser(User user) {
        jedisTemplate.opsForHash().put("user","name", user.getName());
        Object name =  jedisTemplate.opsForHash().get("user","name");
        System.out.println(name);
    }

    public User getUser(Integer id) {
        return null;
    }

}
