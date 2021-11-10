package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * @author Administrator
 * 解决中文字符集乱码
 * 实现Filter接口并重写doFilter函数(Filter接口由引入的包提供)
 */
public class EnCodingFilter implements Filter {
    public EnCodingFilter() {
        System.out.println("执行过滤器");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        filterChain.doFilter(request, response);
    }
    @Override
    public void destroy() {
    }
}
