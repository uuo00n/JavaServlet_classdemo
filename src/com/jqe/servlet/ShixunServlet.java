package com.jqe.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author uuo00_n(Hwang Jumbo)
 * @Date 2022/11/25 11:20
 */
//@WebServlet("/shixun")
@WebServlet(name = "ShixunServlet")
public class ShixunServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Read all Parameter</title></head>");
        out.println("<body>\n");
        out.println("<h3>客户端请求参数表</h3>");
        out.println("<table border=1 align=left>\n");
        out.println("<tr bgcolor=\"#FFFFFF\">\n");
        out.println("<th>参数名<th>参数值");
        Enumeration enuName = request.getParameterNames();
        while (enuName.hasMoreElements()) {
            String strParam = (String) enuName.nextElement();
            out.println("<tr><td>" + strParam + "\n<td>");
            String[] paramValues = request.getParameterValues(strParam);
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValues.length == 0) {
                    out.print("<i>Empty</i>");
                } else
                    out.print(paramValue);
            } else {
                out.print("<ul>");
                for (int i = 0; i < paramValues.length; i++) {
                    out.println("<li>" + paramValues[i]);
                }
                out.print("</ul>");
            }
        }
        out.print("<table>\n</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
