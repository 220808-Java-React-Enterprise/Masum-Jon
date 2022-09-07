package com.revature.P1.models;

import com.revature.P1.models.user;

public class admin extends user {
    private String role_id;
    private String role;

    public admin(String role_id, String role) {
        super();
        this.role_id = role_id;
        this.role = role;
    }

    @Override
    public String toString() {
        return "admin{" +
                "role_id='" + role_id + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public String getRole_id() {
        return role_id;
    }

    @Override
    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
