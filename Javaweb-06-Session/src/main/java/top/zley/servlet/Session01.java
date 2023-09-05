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
 * @description Session 使用
 * @date: 2023/9/4 10:44
 */

public class Session01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 获得session
        HttpSession session = req.getSession();

        // 给session添加键值
        session.setAttribute("name","赵磊");

        // 给session添加对象
        session.setAttribute("user",new user("赵磊",23));

        //获得Session的ID
        String sessionId = session.getId();

        // 判断session是否为新的
        if(session.isNew()){
            resp.getWriter().write("Session第一次创建，ID为："+sessionId);
        }else {
            resp.getWriter().write("Session已经存在，ID为："+sessionId);
        }
        // 获得session的键值
       // resp.getWriter().write((String)session.getAttribute("name"));


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
