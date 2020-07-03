package com.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author OriKey
 * @create 2020- 07- 03 9:21
 * -- 平凡才是唯一的答案 --
 **/
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","HelloSpringMVC");
        modelAndView.setViewName("Hello");
        return modelAndView;
    }
}
