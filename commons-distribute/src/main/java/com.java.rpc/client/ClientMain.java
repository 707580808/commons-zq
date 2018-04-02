package com.java.rpc.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.java.rpc.interfaces.HelloService;
/**
 * Copyright (C), 2016-2017 中盈优创
 * ClientMain
 * @Author: zhuqiang
 * @Date: 18/4/2
 */
public class ClientMain {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        HelloService helloService=(HelloService) Naming.lookup("rmi://localhost:8081/helloService");
        System.out.println("服务端"+helloService.sayHello("client"));
    }
}
