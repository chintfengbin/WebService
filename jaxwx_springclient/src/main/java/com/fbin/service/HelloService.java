package com.fbin.service;

import javax.jws.WebService;

@WebService
public interface HelloService {
    String sayHello(String name);
}
