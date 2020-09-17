package org.fbin.service.impl;

import org.fbin.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+"hello";
    }
}
