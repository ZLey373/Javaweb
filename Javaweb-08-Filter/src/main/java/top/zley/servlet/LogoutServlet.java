package top.zley.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ZLey
 * @description 退出登录
 * @date: 2023/9/5 16:28
 */

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attribute = req.getSession().getAttribute("USER_SESSION");
        if(attribute==null){
            resp.sendRedirect("/login.jsp");
        }else{
            req.getSession().removeAttribute("USER_SESSION");
            resp.sendRedirect("/login.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
