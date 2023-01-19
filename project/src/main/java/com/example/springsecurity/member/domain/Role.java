package com.example.springsecurity.member.domain;

import lombok.Getter;

@Getter
public enum Role {

    MEMBER("ROLE_MEMBER", "일반 회원"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String key;

    private final String value;

    Role(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
