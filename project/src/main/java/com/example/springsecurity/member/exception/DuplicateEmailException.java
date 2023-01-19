package com.example.springsecurity.member.exception;

import com.example.springsecurity.common.error.ErrorCode;
import com.example.springsecurity.common.error.exception.BaseException;

public class DuplicateEmailException extends BaseException {

    public DuplicateEmailException() {
        super(ErrorCode.DUPLICATE_EMAIL);
    }

}
