package com.example.demo.model.dto.completeuser;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CompleteUserTodoDTO {

    private String title;
    private Boolean completed;

}
