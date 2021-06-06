package com.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(55555)
                .addService(new PersonService())  //作成したサービスのインスタンスを設定
                .build();
        try {
            server.start();
            server.awaitTermination();
        }catch(Exception e){
            // none
        }
    }
}
