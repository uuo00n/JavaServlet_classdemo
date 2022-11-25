package com.jqe.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "ServletDemo")
public class ServletDemo_bean extends javax.servlet.http.HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String content = request.getParameter("content");
        PrintWriter out = response.getWriter();
        if (content.equals("JSP")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_bean.jsp");
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("show_bean.jsp");
        }
    }
}
