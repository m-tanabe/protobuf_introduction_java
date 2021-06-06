package com.client;

import com.google.common.util.concurrent.Uninterruptibles;
import com.mongodb.internal.connection.Time;
import com.sectoin07.models.UserRequest;
import com.sectoin07.models.UserResponse;
import com.sectoin07.models.UserServiceGrpc;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class PersonClientNonBlocking {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",55555)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceStub nonBlockingStub;
        nonBlockingStub = UserServiceGrpc.newStub(managedChannel);

        UserRequest userRequest = UserRequest.newBuilder()
                .setUserId(100)
                .build();

        CountDownLatch latch = new CountDownLatch(1);
        nonBlockingStub.getUserInfo(userRequest, new PersonStreamingResponse(latch));

        Uninterruptibles.sleepUninterruptibly(20, TimeUnit.SECONDS);
        latch.await();
    }
}
