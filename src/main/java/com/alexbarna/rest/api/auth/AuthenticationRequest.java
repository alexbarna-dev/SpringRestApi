package com.alexbarna.rest.api.auth;

public class AuthenticationRequest {
    private String username;
    private String password;
    public AuthenticationRequest()
    {
    }
    public AuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
    public String AuthenticationRequest() {
        return this.username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}