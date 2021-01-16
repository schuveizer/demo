package com.example.demo.model.domain.unit;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document (collection = "todo")

public class TodoDomain {

    private String userId;
    @Id
    private String id;
    private String title;
    private Boolean completed;

}