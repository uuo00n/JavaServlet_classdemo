package com.jqe.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "dles_sc_Servlet")
public class dles_sc_Servlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("NAME");
        String password = request.getParameter("PWD");
        PrintWriter out = response.getWriter();
        out.println("<h1>huangjunbo input</h1>");
        out.println("<br>");
        out.println("<li>");
        out.println("登录密码为：");
        out.println(password);
        out.println("</li>");
        out.println("<br>");
        out.println("<li>");
        out.println("登录姓名为：");
        out.println(name);
        out.println("</li>");
    }
}
