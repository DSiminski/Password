package com.Password.configs.security.Entities;

public class Token {

    public String token;
    public String AuthenticationType = "Bearer";

    public Token(String token) {
        this.token = token;
    }

}
