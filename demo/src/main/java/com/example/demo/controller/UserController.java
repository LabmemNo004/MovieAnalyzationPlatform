package com.example.demo.controller;

import com.example.demo.Entity.user;
import com.example.demo.dao.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//使用该注解返回类型自动调整为json.
public class UserController {

    @Autowired
    userRepository UserRepository;

    @GetMapping(value = "/watchList")
    public List<user> getWatchList()
    {
        return UserRepository.findAll();
    }
}
