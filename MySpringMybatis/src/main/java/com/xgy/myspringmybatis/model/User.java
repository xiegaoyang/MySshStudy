package com.xgy.myspringmybatis.model;

/**
 * Created by hadoop on 2017/9/21.
 */
public class User {

    private Integer id;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
