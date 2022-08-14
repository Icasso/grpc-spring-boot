package com.isaactsui.service;

import com.google.protobuf.Descriptors;
import com.isaactsui.Author;
import com.isaactsui.BookAuthorServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookAuthorClientService {

    @GrpcClient("grpc-isaactsui-service")
    BookAuthorServiceGrpc.BookAuthorServiceBlockingStub synchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int authorId) {
        Author authorRequest = Author.newBuilder().setAuthorId(authorId).build();
        Author authorResponse =  synchronousClient.getAuthor(authorRequest);
        return authorResponse.getAllFields();
    }

}
