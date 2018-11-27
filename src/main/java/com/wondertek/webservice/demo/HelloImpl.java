package com.wondertek.webservice.demo;

import javax.jws.WebService;

@WebService
public class HelloImpl implements Hello {

    public String sayHello(String name) {
        System.out.println("server sayHello() " + name);
        return "hello " + name;
    }
}
