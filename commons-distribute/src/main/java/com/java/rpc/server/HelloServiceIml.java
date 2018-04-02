package com.java.rpc.server;

import com.java.rpc.interfaces.HelloService;
import com.java.rpc.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Copyright (C), 2016-2017 中盈优创
 * HelloServiceIml
 *
 * @Author: zhuqiang
 * Date: 18/3/28
 */
public class HelloServiceIml extends UnicastRemoteObject implements HelloService {
    protected HelloServiceIml() throws RemoteException {
        super();
    }

    @Override
    public Student sayHello(Student someOne) throws RemoteException {
        Student student = new Student();
        student.setId("1");
        student.setName("zq");
        return student;
    }
}
