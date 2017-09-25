package com.xgy.myspring;

import com.xgy.myspring.helloworld.impl.SpringHelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by hadoop on 2017/8/29.
 */
@SuppressWarnings("deprecation")
public class MySpring {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        SpringHelloWorld springHelloWorld = (SpringHelloWorld) bf.getBean("springHelloWorld");
        springHelloWorld.sayHello();
    }
}
