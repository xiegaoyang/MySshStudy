package com.xgy.myspringjdbc.service;

import com.xgy.myspringjdbc.dao.UserRowMapper;
import com.xgy.myspringjdbc.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;


/**
 * Created by hadoop on 2017/9/24.
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertUser(User user) {
        jdbcTemplate.update("insert into user(name, age) values(?,?)",
                new Object[]{user.getName(), user.getAge()},
                new int[]{Types.VARCHAR, Types.INTEGER});
    }

    public User getUser(Integer id) {
        return null;
    }

    public List<User> getUsers() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }
}
