package com.example.demo.utils.db.unit;

import com.example.demo.model.domain.completeuser.CompleteUserCommentDomain;
import com.example.demo.model.domain.unit.CommentDomain;
import com.example.demo.model.gateway.CommentGateway;
import com.example.demo.model.request.unit.CommentRequest;
import com.example.demo.model.response.unit.CommentResponse;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component

public class ConverterCommentDB {

    public static CommentDomain convertCommentRequestToDomain (CommentRequest comment){
        return CommentDomain.builder()
                .postId(new ObjectId(comment.getPostId()))
                .name(comment.getName())
                .email(comment.getEmail())
                .body(comment.getBody())
                .build();
    }

    public static CommentResponse convertCommentDomainToResponse (CommentDomain comment){
        return CommentResponse.builder()
                .postId(comment.getPostId().toHexString())
                .id(comment.getId().toHexString())
                .name(comment.getName())
                .email(comment.getEmail())
                .body(comment.getBody())
                .build();
    }

    public static CommentDomain convertCommentGatewayToDomain(CommentGateway comment) {
        return CommentDomain.builder()
                .name(comment.getName())
                .email(comment.getEmail())
                .body(comment.getBody())
                .build();
    }

    public static CommentDomain convertCommentGatewayToDomainWithPostId(CommentGateway comment, String postId) {
        return CommentDomain.builder()
                .postId(new ObjectId(postId))
                .name(comment.getName())
                .email(comment.getEmail())
                .body(comment.getBody())
                .build();
    }
}
