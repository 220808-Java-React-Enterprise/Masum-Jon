package com.revature.P1.dtos.requests;

public class NewUserRequest {
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public NewUserRequest()
    {}

    public NewUserRequest(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword1(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "NewUserRequest{" +
                "username='" + username + '\'' +
                ", password1='" + password + '\'' +
                ", password2='" + password + '\'' +
                '}';
    }
}
