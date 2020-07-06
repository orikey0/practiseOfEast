package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastjsonSockJsMessageCodec;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.pojo.User;
import com.util.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author OriKey
 * @create 2020- 07- 04 17:50
 * -- 平凡才是唯一的答案 --
 **/
@RestController
public class JsonController {
    @RequestMapping("/json1")
    public String test_json() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
    @RequestMapping("/json2")
    public String test_json2() {

        User user = new User("厉害",123,"男");
        User user1 = new User("厉害",123,"男");
        User user2 = new User("厉害",123,"男");
        User user3 = new User("厉害",123,"男");
        List<User>lists = new ArrayList<User>();
        lists.add(user);
        lists.add(user1);
        lists.add(user2);
        lists.add(user3);
//        Java对象转换为Json字符串
        String string = JSON.toJSONString(user);
//        JSON.toJSONString方法 java转JSON对象
//        Json字符串转换为Java对象
        User user4 = JSON.parseObject(string, User.class);
//        Java对象转换为JSON对象
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
//        JSON对象转化为Java对象
        User to_java_usr = JSON.toJavaObject(jsonObject, User.class);
        return JSON.toJSONString(lists);

    }
}
