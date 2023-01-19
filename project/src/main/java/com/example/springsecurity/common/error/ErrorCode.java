package com.example.springsecurity.common.error;

import lombok.Getter;

import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    NOT_FOUND_MEMBER("M000", HttpStatus.NOT_FOUND.value(), "회원을 찾을 수 없습니다."),
    DUPLICATE_EMAIL("M001", HttpStatus.CONFLICT.value(), "사용 중인 이메일 입니다.");

    private final String code;

    private final int status;

    private final String message;

    ErrorCode(String code, int status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

}
