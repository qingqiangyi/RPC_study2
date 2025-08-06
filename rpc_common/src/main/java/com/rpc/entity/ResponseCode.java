package com.rpc.entity;

import lombok.Getter;

@Getter
public enum ResponseCode {
    SUCCESS(200, "Success"),
    FAIL(500, "Internal Server Error");

    private final int code;
    private final String message;

    ResponseCode(int code, String message){
        this.code = code;
        this.message = message;
    }
}
