package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author OriKey
 * @create 2020- 07- 03 14:32
 * -- 平凡才是唯一的答案 --
 **/
@Controller
public class HelloController{
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","HelloSpringMVCAnnotation");
        return "Hello";
    }
}