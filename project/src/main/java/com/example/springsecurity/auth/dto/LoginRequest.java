package com.example.springsecurity.auth.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(of = {"email", "password"})
public class LoginRequest {

    private String email;

    private String password;

}
