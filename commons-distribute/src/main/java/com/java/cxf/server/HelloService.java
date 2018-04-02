package com.java.cxf.server;

import javax.jws.WebService;

/**
 * Copyright (C), 2016-2017 中盈优创
 * HelloService
 *
 * @Author: zhuqiang
 * @Date: 18/4/2
 */
@WebService
public interface HelloService {
    String sayHello(String content);

}
