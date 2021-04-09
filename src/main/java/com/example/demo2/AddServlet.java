package com.example.demo2;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "abc", urlPatterns = {"/add"})
class AddServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        PrintWriter out = response.getWriter();
        out.println("sum is " + i + j);
    }

}
