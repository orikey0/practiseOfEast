package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author OriKey
 * @create 2020- 07- 04 12:21
 * -- 平凡才是唯一的答案 --
 **/
public class encodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
