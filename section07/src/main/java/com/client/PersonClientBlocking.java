package com.client;

import com.sectoin07.models.UserRequest;
import com.sectoin07.models.UserResponse;
import com.sectoin07.models.UserServiceGrpc;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class PersonClientBlocking {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",55555)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub;
        blockingStub = UserServiceGrpc.newBlockingStub(managedChannel);

        UserRequest userRequest = UserRequest.newBuilder()
                .setUserId(100)
                .build();

        try {
            UserResponse userResponse = blockingStub.withDeadline(Deadline.after(10, TimeUnit.SECONDS))
                    .getUserInfo(userRequest);
            System.out.println(userResponse.toString());
        }catch (StatusRuntimeException e) {
            System.out.println("deadline");
        }
    }
}
