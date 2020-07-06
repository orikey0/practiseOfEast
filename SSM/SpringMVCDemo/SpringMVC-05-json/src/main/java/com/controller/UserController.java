package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author OriKey
 * @create 2020- 07- 04 16:18
 * -- 平凡才是唯一的答案 --
 **/

//注解说明，RstController不走视图解析器
@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//不走视图解析器
    public String json1(){
        User user = new User("李厚华",20,"男");
        return user.toString();
    }
    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        User user= new User("OriKey",123,"man");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(user);
    }
}
