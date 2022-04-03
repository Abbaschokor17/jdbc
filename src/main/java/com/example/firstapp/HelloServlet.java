package com.example.firstapp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "hello-servlet")
public class HelloServlet extends HttpServlet {
    private static HelloWorld hello_world_bean;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        hello_world_bean=new HelloWorldBean();

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + hello_world_bean.hello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}