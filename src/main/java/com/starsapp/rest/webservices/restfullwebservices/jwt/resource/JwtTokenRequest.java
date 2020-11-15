package com.starsapp.rest.webservices.restfullwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYwNjA0MjU5MiwiaWF0IjoxNjA1NDM3NzkyfQ.TVd-yrTrAQTiVn-T-XBPdVe7YEcZTFFa5pI8xKYxZ1R0lW9BH9t5jJjh8PDtajgi9DUIkpn21YUD1V_TWx1k0Q"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
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
