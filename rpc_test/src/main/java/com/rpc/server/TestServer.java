package com.rpc.server;

import com.rpc.api.HelloService;
import com.rpc.service.HelloServiceImpl;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 9000);
    }
}

