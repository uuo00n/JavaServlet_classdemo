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

@WebServlet(name = "AddServlet")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<String>();
        }
        request.setCharacterEncoding("UTF-8");
        String[] goods = request.getParameterValues("goods");
        int num = 0;
        if (goods != null) {
            num = goods.length;
            for (String s : goods) {
                cart.add(s);
            }
        }
        session.setAttribute("cart", cart);
        PrintWriter out = response.getWriter();
        out.println("成功将" + num + "将物品放入购物车!<br>");
        out.println("<a href=\"ShopServlet\">继续购物</a><br>");
        out.println("<a href=\"ShowServlet\">查看购物车</a><br>");
        out.println("<a href=\"LogoutServlet\">退出</a><br>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
