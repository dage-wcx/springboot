package com.example.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FirstFilter",urlPatterns = "/first")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter->过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFilter->进入过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("FirstFilter->离开过滤器");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter->过滤器销毁");
    }
}
