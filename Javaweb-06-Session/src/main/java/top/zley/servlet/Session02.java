package top.zley.servlet;

import top.zley.pojo.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author: ZLey
 * @description
 * @date: 2023/9/4 11:00
 */

public class Session02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 获得session
        HttpSession session = req.getSession();


        // 获得session的键值, Session可以跨类别，共享信息
        resp.getWriter().write((String)session.getAttribute("name"));

        // 获得session的对象, Session可以跨类别，共享信息
        user user = (user) session.getAttribute("user");
        resp.getWriter().write(user.toString());

        // 手动注销session
        session.removeAttribute("name");
        session.invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}