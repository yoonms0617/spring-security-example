package com.example.springsecurity.common.error;

import lombok.Getter;

@Getter
public class ErrorResponse {

    private final String code;

    private final int status;

    private final String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
    }

    public static ErrorResponse of(ErrorCode errorCode) {
        return new ErrorResponse(errorCode);
    }

}
