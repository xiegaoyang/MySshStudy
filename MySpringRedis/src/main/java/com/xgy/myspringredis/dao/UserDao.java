package com.xgy.myspringredis.dao;

import com.xgy.myspringredis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by hadoop on 2017/9/24.
 */
@Repository
public class UserDao {

    @Autowired
    protected RedisTemplate<Serializable, Serializable> jedisTemplate;

    public void saveUser(final User user) {
        jedisTemplate.execute(new RedisCallback<Object>() {
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set(
                        jedisTemplate.getStringSerializer().serialize(user.getId() + ""),
                        jedisTemplate.getStringSerializer().serialize(user.getName()));
                return null;
            }

        });
    }

    public User getUser(final int id) {
        return jedisTemplate.execute(new RedisCallback<User>() {
            public User doInRedis(RedisConnection connection) throws DataAccessException {
                byte[] key = jedisTemplate.getStringSerializer().serialize(id + "");
                if (connection.exists(key)) {
                    byte[] value = connection.get(key);
                    String name = jedisTemplate.getStringSerializer().deserialize(value);
                    User user = new User();
                    user.setName(name);
                    user.setId(id);
                    return user;
                }
                return null;
            }
        });
    }

}
