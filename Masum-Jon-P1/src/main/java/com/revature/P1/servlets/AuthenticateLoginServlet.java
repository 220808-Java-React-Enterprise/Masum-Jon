package com.revature.P1.servlets;
/*

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.P1.dtos.requests.LoginRequests;
import com.revature.P1.dtos.responses.Principal;

import com.revature.P1.services.UserService;
import com.revature.P1.utils.CustomException.AuthenticationException;
import com.revature.P1.utils.CustomException.InvalidRequestException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticateLoginServlet extends HttpServlet {
    private final ObjectMapper mapper;
    private final UserService UserService;


    public AuthenticateLoginServlet(ObjectMapper mapper, UserService userService) {
        this.mapper = mapper;
        UserService = userService;

    }



    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{

            LoginRequest request= mapper.readValue(req.getInputStream(), LoginRequest.class);
            Principal Principle=UserService.login(request);
            resp.setStatus(200);

            resp.setContentType("application/json");

            resp.getWriter().write(mapper.writeValueAsString(Principle));
        }catch(AuthenticationException e){
            resp.setStatus(404);
        }catch(InvalidRequestException e){
            resp.setStatus(401);
        }
    }
}


 */