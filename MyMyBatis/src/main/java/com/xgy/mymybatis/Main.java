package com.xgy.mymybatis;

import com.xgy.mymybatis.dao.UserMapper;
import com.xgy.mymybatis.model.User;
import com.xgy.mymybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by hadoop on 2017/9/21.
 */
public class Main {

    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    public static void insertUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User("xgy", new Integer(28));
            userMapper.insertUser(user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public static void getUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1);
            System.out.println(user.toString());
        } finally {
            sqlSession.close();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
//        Main.insertUser();
        Main.getUser();
    }

}
