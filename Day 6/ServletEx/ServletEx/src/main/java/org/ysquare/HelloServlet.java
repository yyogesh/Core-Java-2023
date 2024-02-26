package org.ysquare;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Service calling.. ");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h3>Hello world</h3>");
    }
}
