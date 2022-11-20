package com.jqe.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author uuo00_n(Hwang Jumbo)
 * @Date 2022/11/20 18:54
 */
public class herfservlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String lengthstr = req.getParameter("length");
        int length = Integer.parseInt(lengthstr);
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("面积是" + length * length);
        out.println("<br>" + "黄俊博第二个程序");
        out.println("</html></body>");
    }
}
