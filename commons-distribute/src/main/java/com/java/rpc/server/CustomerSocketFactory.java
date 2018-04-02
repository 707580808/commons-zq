package com.java.rpc.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.RMISocketFactory;

/**
 * 指定rmi 端口（rmi的通信接口是随机产生，为防止防火墙需指定端口）
 * Copyright (C), 2016-2017 中盈优创
 * CustomerSocketFactory
 *
 * @Author: zhuqiang
 * @Date: 18/4/2
 */
public class CustomerSocketFactory extends RMISocketFactory {
    @Override
    public Socket createSocket(String host, int port) throws IOException {
        return new Socket(host, port);
    }

    @Override
    public ServerSocket createServerSocket(int port) throws IOException {
        if (port == 0) {
            port = 8501;
        }
        System.out.println("rmi notify port:" + port);
        return new ServerSocket(port);
    }
}
