package com.example.springsecurity.member.exception;

import com.example.springsecurity.common.error.ErrorCode;
import com.example.springsecurity.common.error.exception.BaseException;

public class NotFoundMemberException extends BaseException {

    public NotFoundMemberException() {
        super(ErrorCode.NOT_FOUND_MEMBER);
    }

}
