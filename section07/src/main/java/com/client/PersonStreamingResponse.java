package com.client;

import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class PersonStreamingResponse implements StreamObserver {
    private CountDownLatch countDownLatch;

    public PersonStreamingResponse(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void onNext(Object value) {
        System.out.println("Received Async :" + value.toString());
    }

    @Override
    public void onError(Throwable t) {
        this.countDownLatch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println("Server Done");
        this.countDownLatch.countDown();
    }
}
