package com.java.rpc.interfaces;

import com.java.rpc.model.Student;

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
    Student sayHello(Student someOne) throws RemoteException;
}
