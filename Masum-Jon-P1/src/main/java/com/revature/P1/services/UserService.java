package com.revature.P1.services;

import com.revature.P1.daos.User_Daos;
import com.revature.P1.dtos.requests.LoginRequests;
import com.revature.P1.dtos.requests.NewUserRequest;
import com.revature.P1.dtos.responses.Principal;
import com.revature.P1.models.Users.ERS_Users;
import com.revature.P1.utils.CustomException.AuthenticationException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
public class UserService {
    private User_Daos userDaos = null;

    public void UserService(User_Daos userDAO) {
        this.userDaos = userDaos;
    }

    public UserService(User_Daos userDaos) {
        this.userDaos = userDaos;
    }

    public Principal login(LoginRequests request) {
        ERS_Users user =userDaos.getUserByUsernameAndPassword(request.getUsername(), request.getPassword());
        if (user == null) throw new AuthenticationException("\nIncorrect username or password :(");
        return new Principal(user.getId(), user.getUsername(), user.getRole_id());
    }

    public ERS_Users register(NewUserRequest request) {
        ERS_Users user = null;

        if (isValidUsername(request.getUsername())) {
            if (!isDuplicateUsername(request.getUsername())) {
                if (isValidPassword(request.getPassword())) {
                    if (isSamePassword(request.getPassword())) {
                        user = new ERS_Users(UUID.randomUUID().toString(), request.getUsername(), request.getPassword());
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

    private StringBuilder passwordHash(String password) throws NoSuchAlgorithmException {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Add password bytes to digest
            md.update(password.getBytes());

            // Get the hash's bytes
            byte[] bytes = md.digest();

            // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb;
    }
}
