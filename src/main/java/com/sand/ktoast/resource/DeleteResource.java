package com.sand.ktoast.resource;

import lombok.Data;

@Data
public class UserResource {
    private Integer statusCode;

    private Object data;

    private String message;
}
