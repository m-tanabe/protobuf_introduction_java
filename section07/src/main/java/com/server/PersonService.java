package com.server;

import com.google.common.util.concurrent.Uninterruptibles;
import com.sectoin07.models.UserRequest;
import com.sectoin07.models.UserResponse;
import com.sectoin07.models.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class PersonService extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void getUserInfo(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        String userName, address, phone;
        int age;
        int userID = request.getUserId();

        if(userID == 100){
            userName = "suzuki";
            address = "Tokyo, Minato-ku";
            phone = "090-1234-5678";
            age = 41;
        }else{
            userName = "";
            address = "";
            phone = "";
            age = 0;
        }
        UserResponse userResponse = UserResponse.newBuilder()
                .setName(userName)
                .setAge(age)
                .setAddress(address)
                .setPhone(phone)
                .build();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        //onNextでクライアント側へ送信、onCompletedでレスポンス処理を完了。
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }
}
