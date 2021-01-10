package com.example.demo.model.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document (collection = "album")

public class AlbumDomain {

    private String userId;
    @Id
    private String id;
    private String title;

}