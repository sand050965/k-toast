package com.sand.ktoast.resource;

import lombok.Data;

@Data
public class ProductResource {
    private Object result;

    private Integer statusCode;

    private String message;
}
