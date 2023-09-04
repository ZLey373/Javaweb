package top.zley.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author: ZLey
 * @description 前后端参数传递及请求转发
 * @date: 2023/8/31 10:35
 */

public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");


        String username = req.getParameter("username");
        String password = req.getParameter("password");

        String[] tags = req.getParameterValues("tages");

        System.out.println("================================");
        System.out.println(username);
        System.out.println(password);
        System.out.println(Arrays.toString(tags));
        System.out.println("=================================");

        this.getServletContext().getRequestDispatcher("/success.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
