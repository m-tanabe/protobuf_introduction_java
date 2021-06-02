package com.client;

import com.google.protobuf.ByteString;
import com.section01_01.models.BankRequest;
import com.section01_01.models.BankResponse;
import com.section01_01.models.BankServiceGrpc;
import com.section01_01.models.BankUserInfo;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class BankClient {
    public static void main(String[] args) {
        BankUserInfo bankUserInfo = BankUserInfo.newBuilder()
                .setBankName("Mizuho")
                .setBranchCode(101)
                .setAccountNumber("1234567")
                .build();

        ByteString request = bankUserInfo.toByteString();
        BankRequest bankRequest = BankRequest.newBuilder()
                .setRequest(request)
                .build();

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 55555)
                .usePlaintext()
                .build();

        BankServiceGrpc.BankServiceBlockingStub blockingStub;
        blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);

        try{
            BankResponse bankResponse = blockingStub.withDeadline(Deadline.after(10, TimeUnit.SECONDS))
                    .getBalance(bankRequest);

            System.out.println("balance=" + bankResponse.getBalance());
        } catch(StatusRuntimeException e){
            System.out.println("deadline");
        }
    }
}
