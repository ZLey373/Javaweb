package top.zley.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author: ZLey
 * @description cookie的使用
 * @date: 2023/9/1 9:56
 */

public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");//加上此句，否则也会出现乱码，enconde,decode都无法解决
        req.setCharacterEncoding("utf-8");

        Cookie[] cookies = req.getCookies();
        PrintWriter out = resp.getWriter();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("username")){
//                out.write(URLDecoder.decode(cookie.getValue(),"gb2312"));
//                out.write(URLDecoder.decode(cookie.getValue(),"utf-8"));
                out.write("用户名："+cookie.getValue());
            }
        }

        String s = URLEncoder.encode("秀才");
        Cookie c = new Cookie("username", "赵磊");
        c.setMaxAge(60);
        resp.addCookie(c);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
