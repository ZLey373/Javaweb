package top.zley.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: ZLey
 * @description 过滤器的实现
 * @date: 2023/9/5 14:39
 */

public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("Filter执行前");
        chain.doFilter(request,response);
        System.out.println("Filter执行后");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
