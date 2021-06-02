package com.server;

import com.google.common.util.concurrent.Uninterruptibles;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.section01_01.models.BankRequest;
import com.section01_01.models.BankResponse;
import com.section01_01.models.BankServiceGrpc;
import com.section01_01.models.BankUserInfo;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBalance(BankRequest request, StreamObserver<BankResponse> responseObserver) {
        ByteString request_row = request.getRequest();
        try {
            BankUserInfo bankUserInfo = BankUserInfo.parseFrom(request_row);

            int response_balance = 0;
            if(bankUserInfo.getBankName().equals("Mizuho") &&
               bankUserInfo.getAccountNumber().equals("1234567")){
                response_balance = 15000;
            }

            BankResponse bankResponse = BankResponse.newBuilder()
                    .setBalance(response_balance)
                    .build();

            Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
            responseObserver.onNext(bankResponse);
            responseObserver.onCompleted();

        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
