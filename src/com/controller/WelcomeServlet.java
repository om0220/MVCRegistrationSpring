package com.controller;

import java.io.IOException;

import java.io.PrintWriter;  

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class WelcomeServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/jsp");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("name");  
    out.print("Welcome "+n);  
          
    out.close();  
    }  
  
}  