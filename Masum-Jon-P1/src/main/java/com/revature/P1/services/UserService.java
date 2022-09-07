package com.revature.P1.services;

import com.revature.P1.dtos.requests.NewUserRequest;
import com.revature.P1.daos.UserDaos;
import com.revature.P1.models.User;

import java.util.UUID;
public class UserService {
    private UserDaos userDaos = null;

    public void UserService(UserDaos userDAO) {
        this.userDaos = userDaos;
    }

    public UserService(UserDaos userDaos) {
        this.userDaos = userDaos;
    }

    public User register(NewUserRequest request) {
        User user = null;

        if (isValidUsername(request.getUsername())) {
            if (!isDuplicateUsername(request.getUsername())) {
                if (isValidPassword(request.getPassword())) {
                    if (isSamePassword(request.getPassword())) {
                        user = new User(UUID.randomUUID().toString(), request.getUsername(), request.getPassword());
                        userDaos.save(user);
                    }
                }
            }
        }

        return user;
    }

    private boolean isSamePassword(String password1) {
        return false;
    }

    private boolean isValidPassword(String password1) {
        return false;
    }

    private boolean isDuplicateUsername(String username) {
        return false;
    }

    private boolean isValidUsername(String username) {
        return false;
    }
}
