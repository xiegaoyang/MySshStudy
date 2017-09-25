package com.xgy.myspring.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hadoop on 2017/8/19.
 */
public class AopClient {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserManager userManager = (UserManager) factory.getBean("userManager");

        //可以查找张三
        userManager.findUserById(1);

        System.out.println("\n=====我==是==分==割==线=====\n");

        try {
            // 查不到数据，会抛异常，异常会被AfterThrowingAdvice捕获
            userManager.findUserById(0);
        } catch (IllegalArgumentException e) {
        }
    }
}
