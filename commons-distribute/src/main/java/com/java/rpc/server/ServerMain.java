package com.java.rpc.server;

import com.java.rpc.interfaces.HelloService;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMISocketFactory;

/**
 * Copyright (C), 2016-2017 中盈优创
 * ServerMain
 * @Author: zhuqiang
 * @Date: 18/4/2
 */
public class ServerMain {
    public static void main(String[] args) throws IOException, AlreadyBoundException {
        LocateRegistry.createRegistry(8081);
        //指定通信端口，防止防火墙拦截
        RMISocketFactory.setSocketFactory(new CustomerSocketFactory());
        HelloService helloService=new HelloServiceIml();

        Naming.bind("rmi://192.168.116.214:8081/helloService",helloService);
        System.out.println("ServerMain provide service now");
    }
}
