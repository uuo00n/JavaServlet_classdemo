package com.jqe.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author uuo00_n(Hwang Jumbo)
 * @Date 2022/11/20 15:53
 */
public class FormServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String age = req.getParameter("age");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("姓名是" + name);
        out.println("<br>");
        out.println("密码是" + password);
        out.println("<br>");
        out.println("性别是" + sex);
        out.println("<br>");
        out.println("年龄是" + age);
        out.println("黄俊博的第一个程序");
        out.println("</html></body>");
    }
}
