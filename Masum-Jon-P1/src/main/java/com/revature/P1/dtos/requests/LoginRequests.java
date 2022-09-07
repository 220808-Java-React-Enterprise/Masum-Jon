package com.revature.P1.dtos.requests;

public class LoginRequests {
    private String username;
    private String password;
    public LoginRequests(){}
    public void loginRequestl(String username, String password){
        this.password=password;
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "loginRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}