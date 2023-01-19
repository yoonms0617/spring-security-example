package com.example.springsecurity.common.error.handler;

import com.example.springsecurity.common.error.ErrorCode;
import com.example.springsecurity.common.error.ErrorResponse;
import com.example.springsecurity.common.error.exception.BaseException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseException e) {
        final ErrorCode errorCode = e.getErrorCode();
        final ErrorResponse errorResponse = ErrorResponse.of(errorCode);
        return ResponseEntity.status(errorCode.getStatus()).body(errorResponse);
    }

}
