package com.xgy.myspringredis;

import com.xgy.myspringredis.dao.UserDao;
import com.xgy.myspringredis.model.User;
import com.xgy.myspringredis.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//http://greemranqq.iteye.com/blog/2202731

/**
 * Created by hadoop on 2017/9/24.
 */
public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-redis.xml");
//        UserDao userDAO = (UserDao) ac.getBean("userDao");
//
//        User user = new User();
//        user.setId(1);
//        user.setName("liuting");
//        user.setAge(29);
//        userDAO.saveUser(user);
//
//        User liuxg = userDAO.getUser(1);
//        System.out.println(liuxg.toString());

        //第二种方式
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-redis.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user = new User();
        user.setId(6);
        user.setName("xxxxx");
        userService.insertUser(user);

    }

}
