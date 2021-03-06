package com.example.demo.model.request.unit;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder

public class AlbumRequest {

    @NotNull
    private String userId;
    private String title;

}
