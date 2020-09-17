package com.fbin.service.impl;

import com.fbin.service.HelloService;

import javax.jws.WebService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
