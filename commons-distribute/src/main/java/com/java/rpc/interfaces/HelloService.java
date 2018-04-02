package com.java.rpc.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Copyright (C), 2016-2017 中盈优创
 * HelloService
 *
 * @Author: zhuqiang
 * Date: 18/3/28
 */
public interface HelloService extends Remote {
    String sayHello(String someOne) throws RemoteException;
}
