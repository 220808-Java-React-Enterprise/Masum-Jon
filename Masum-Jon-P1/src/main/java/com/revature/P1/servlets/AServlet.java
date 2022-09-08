package com.revature.P1.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.P1.dtos.requests.LoginRequests;
import com.revature.P1.dtos.responses.Principal;

import com.revature.P1.services.TokenService;
import com.revature.P1.services.UserService;
import com.revature.P1.utils.CustomException.AuthenticationException;
import com.revature.P1.utils.CustomException.InvalidRequestException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AServlet extends HttpServlet {
    private final ObjectMapper mapper;
    private final UserService userService;
private final TokenService tokenService;

    public AServlet(ObjectMapper mapper,TokenService tokenService,UserService userService) {
        this.mapper = mapper;
        this.userService = userService;
        this.tokenService = tokenService;
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            LoginRequests request= mapper.readValue(req.getInputStream(), LoginRequests.class);
            Principal principal=userService.login(request);
            String token=tokenService.generateToken(principal);
            resp.setStatus(200);
            resp.setHeader("Authorization",token);
            resp.setContentType("application/json");
            resp.getWriter().write(mapper.writeValueAsString(principal));
        }catch(AuthenticationException e){
            resp.setStatus(404);
        }catch(InvalidRequestException e){
            resp.setStatus(401);
        }
    }


}


