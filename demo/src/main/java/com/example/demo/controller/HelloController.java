package com.example.demo.controller;

import com.example.demo.Entity.user;
import com.example.demo.JSON.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class HelloController {

    @RequestMapping("/user")
    public JsonResult<user> getUser() {
        user users = new user("倪升武", "123456","~/static/img/1.png");
        return new JsonResult<>(users);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList() {
        List<user> userList = new ArrayList<>();
        user user1 = new user("倪升武1", "123456","~/static/img/1.png");
        user user2 = new user("达人课2", "123456","~/static/img/1.png");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String, Object> map = new HashMap<>(1);
        //user user = new user("倪升武3", null,null);
        //map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return new JsonResult<>(map,"成功");
    }

    @RequestMapping("/hello")
    public String getHelloWorld()
    {
        return "Hello Spring";
    }
}
