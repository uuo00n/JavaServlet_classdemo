package com.jqe.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetPostServlet")
public class GetPostServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String content = request.getParameter("content");
        PrintWriter out = response.getWriter();
        out.println("用户的请求方式是POST");
        out.println("<br>");
        out.println("提交的内容是：" + content);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String content = request.getParameter("content");
        PrintWriter out = response.getWriter();
        out.println("用户的请求方式是GET");
        out.println("<br>");
        out.println("提交的内容是：" + content);
    }

}
