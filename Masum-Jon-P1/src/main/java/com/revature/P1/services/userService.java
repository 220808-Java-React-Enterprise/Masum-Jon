package com.revature.P1.services;

import com.revature.P1.dtos.requests.NewUserRequest;
import com.revature.P1.daos.UserDaos;
import com.revature.P1.models.user;

import java.util.UUID;
public class userService {
    private UserDaos userDaos = null;

    public void UserService(UserDaos userDAO) {
        this.userDaos = userDaos;
    }

    public userService(UserDaos userDaos) {
        this.userDaos = userDaos;
    }

    public user register(NewUserRequest request) {
        user user = null;

        if (isValidUsername(request.getUsername())) {
            if (!isDuplicateUsername(request.getUsername())) {
                if (isValidPassword(request.getPassword1())) {
                    if (isSamePassword(request.getPassword1(), request.getPassword2())) {
                        user = new user(UUID.randomUUID().toString(), request.getUsername(), request.getPassword1());
                        userDaos.save(user);
                    }
                }
            }
        }

        return user;
    }

    private boolean isSamePassword(String password1, String password2) {
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
