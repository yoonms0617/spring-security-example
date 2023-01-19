package com.example.springsecurity.member.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(of = {"name", "email", "password"})
public class SignupRequest {

    private String name;

    private String email;

    private String password;

}
