package com.revature.P1.servlets;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.P1.services.userService;

import java.io.IOException;


public class UserServlet extends HttpServlet {
private final ObjectMapper mapper;
private final userService userService;



    public UserServlet(ObjectMapper mapper, com.revature.P1.services.userService userService) {
        this.mapper = mapper;
        this.userService = userService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}


