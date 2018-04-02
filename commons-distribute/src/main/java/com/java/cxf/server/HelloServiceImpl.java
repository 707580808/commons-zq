package com.java.cxf.server;

import javax.jws.WebService;

/**
 * Copyright (C), 2016-2017 中盈优创
 * HelloServiceImpl
 *
 * @Author: zhuqiang
 * @Date: 18/4/2
 */
@WebService(endpointInterface = "com.java.cxf.server.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String content) {
        return content;
    }
}
