package com.revature.P1.servlets;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.P1.dtos.requests.NewUserRequest;
import com.revature.P1.services.UserService;

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
        NewUserRequest request = mapper.readValue(req.getInputStream(), NewUserRequest.class);
        resp.getWriter().write(mapper.writeValueAsString(request));

    }



}


