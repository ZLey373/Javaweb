package top.zley.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ZLey
 * @description  测试ServletContext如何在多个servlet之间通信
 * @date: 2023/8/30 10:02
 */

public class shareservletcontext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建共享容器ServletContext
        ServletContext servletContext = this.getServletContext();
        String name="赵磊";

        // 数据上传到容器中
        servletContext.setAttribute("username",name);
        System.out.println("数据分享至servletContext");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
