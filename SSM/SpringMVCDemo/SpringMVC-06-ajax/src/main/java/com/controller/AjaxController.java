package com.controller;

import com.pojo.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 05 22:29
 * -- 平凡才是唯一的答案 --
 **/
@RestController
public class AjaxController {

    @RequestMapping("/test")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1=>name:"+name);
        if ("user".equals(name)) {
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> res = new LinkedList<User>();
        res.add(new User("lihouhua",123,"男"));
        res.add(new User("lihouasdfhua",123,"女"));
        res.add(new User("lihofasdfuhua",123,"女"));
        res.add(new User("lihofasdfuhua",123,"男"));
        return res;
    }

}
