package com.xgy.myspring.helloworld;

public class HelloWorldService {

    private HelloWorld helloWorld;

    public HelloWorldService() {

    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

}