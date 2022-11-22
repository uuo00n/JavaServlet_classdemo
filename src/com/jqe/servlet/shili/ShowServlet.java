package com.jqe.servlet.shili;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author uuo00_n(Hwang Jumbo)
 * @Date 2022/11/22 8:05
 */
@WebServlet(name = "ShowServlet")
public class ShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        PrintWriter out = response.getWriter();
        out.println(username + "的购物车：");
        ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
        if (cart != null && cart.size() != 0) {
            for (String s : cart) {
                out.print(s + "&nbsp;");
            }
        } else {
            out.println("您还没有购物");
        }
        out.println("<br><a href=\"ShopServlet\">继续购物</a><br>");
        out.println("<a href=\"LogoutServlet\">退出</a>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
