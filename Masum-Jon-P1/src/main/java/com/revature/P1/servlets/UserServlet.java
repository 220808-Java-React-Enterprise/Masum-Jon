package com.revature.P1.servlets;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.P1.dtos.requests.NewUserRequest;
import com.revature.P1.models.Users.ERS_Users;
import com.revature.P1.services.UserService;
import com.revature.P1.utils.CustomException.InvalidRequestException;
import com.revature.P1.utils.CustomException.ResourceConflictException;


import java.io.IOException;


public class UserServlet extends HttpServlet {
private final ObjectMapper mapper;
private final UserService userService;



    public UserServlet(ObjectMapper mapper, UserService userService) {
        this.mapper = mapper;
        this.userService = userService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
        NewUserRequest request = mapper.readValue(req.getInputStream(), NewUserRequest.class);
        System.out.println(req.getRequestURI());

        String[] path=req.getRequestURI().split("/");
        if(path[3].equals("signup%0A")) {
            System.out.println("signing up");
            ERS_Users createUser=userService.register(request);
            resp.setStatus(200);
            resp.setContentType("application/json");
            resp.getWriter().write(mapper.writeValueAsString(createUser.getUser_id()));
        }
        else System.out.println("Not Allowed");
            }
        catch (InvalidRequestException e) {
            resp.setStatus(404); //NOT FOUND
        }
        catch(ResourceConflictException e){
            resp.setStatus(409); //RESOURCE CONFLICT




        }

    }



}


