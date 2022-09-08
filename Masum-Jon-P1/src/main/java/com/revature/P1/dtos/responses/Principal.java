package com.revature.P1.dtos.responses;

public class Principal {
    private String username;
    private String user_id;
    private String role;
    public Principal(){}

    public Principal(String username, String user_id, String role) {
        this.username = username;
        this.user_id = user_id;
        this.role = role;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
