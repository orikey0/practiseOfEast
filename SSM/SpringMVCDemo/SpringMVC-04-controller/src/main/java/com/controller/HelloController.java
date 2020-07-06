package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author OriKey
 * @create 2020- 07- 03 21:12
 * -- 平凡才是唯一的答案 --
 **/
//此处项目特别说明，如果出现404错误应该考虑WEB-INF下是否有Lib
@Controller
public class HelloController {
//    使用Restful风格进行编码
    @RequestMapping("/Hello/{a}/{b}")
    public String hello(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("msg",a+b);
//        重定向
        return "redirect:/index.jsp";
    }
    @RequestMapping("/index")
    public String index(Model model){
        return "redirect:/index.jsp";
    }
}
