package com.jqe.servlet.shili;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author uuo00_n(Hwang Jumbo)
 * @Date 2022/11/22 13:36
 */
@WebServlet(name = "LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        session.invalidate();
        response.setHeader("Refresh", "3;URL=shili_cartLogin.html");
        PrintWriter out = response.getWriter();
        out.println("正在退出，3秒后返回登录页面......");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
