package com.controller;

import java.io.IOException;



import java.io.PrintWriter;  

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;  
  
  
public class FirstServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/jsp");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("name");  
    String p=request.getParameter("upassword");  
          
    if(LoginDao.validate(n, p)){  
        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
        rd.forward(request,response);  
    }  
    else{  
        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
        rd.include(request,response);  
    }  
          
    out.close();  
    }  
}  


