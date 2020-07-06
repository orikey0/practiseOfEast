package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author OriKey
 * @create 2020- 07- 04 12:02
 * -- 平凡才是唯一的答案 --
 **/
@Controller
public class CodeController {
    @PostMapping("/encoding")

    public String coding(String name,String pwd,Model model){
        model.addAttribute("msg",name+pwd);
        return "test1";
    }
    @GetMapping("/encoding")
    @ResponseBody
    public String test(){
        return "Hello";
    }
}
