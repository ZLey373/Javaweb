package top.zley.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: ZLey
 * @description sys文件下权限设置
 * @date: 2023/9/5 16:30
 */

public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        Object attribute = request.getSession().getAttribute("USER_SESSION");
        if(attribute==null){
            response.sendRedirect("/error.jsp");
        }else{
           // response.sendRedirect("/sys/home.jsp");
        }
        System.out.println("sys_filter执行");
        chain.doFilter(req,resp);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
