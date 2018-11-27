package com.student.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterZF implements Filter {
    public void init(FilterConfig arg0) throws ServletException {
        System.err.println("服务器启动时调用此方法,只调用一次,用来初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        MyRequest request1 = new MyRequest(request);
        //设置request的编码方式
        request1.setCharacterEncoding("utf-8");
        //解除拦截
        filterChain.doFilter(request1, response);
    }

    public void destroy() {
        System.err.println("服务器退出时调用此方法,只调用一次");
    }

}
