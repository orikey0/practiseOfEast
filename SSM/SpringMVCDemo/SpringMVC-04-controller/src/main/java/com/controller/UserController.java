package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author OriKey
 * @create 2020- 07- 04 11:24
 * -- 平凡才是唯一的答案 --
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("test")
    public String UserTest(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        return "test1";
    }

    @GetMapping("t2")
    public String UserTest2(User user,Model model){
//        返回字段相匹配可以直接返回对象组成
        model.addAttribute("msg",user.toString());
        return "test1";
    }
    @GetMapping("t3")
    public String UserTest3(ModelMap modelMap){
//        ModelMap对象继承了linkedHashMap数据结构
        modelMap.addAttribute("msg","ModelMap");
        return "test1";
    }
}
