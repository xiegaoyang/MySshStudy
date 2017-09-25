package com.xgy.myspringjdbc;


import com.xgy.myspringjdbc.model.User;
import com.xgy.myspringjdbc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by hadoop on 2017/9/21.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("刘婷");
        user.setAge(27);
        service.insertUser(user);

        List<User> list = service.getUsers();
        for (User item : list) {
            System.out.println(item.toString());
        }

    }

}
