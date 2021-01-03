package com.example.demo.service;


import com.example.demo.Entity.user;
import com.example.demo.dao.userRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class userService {

    @Resource
    private userRepository UserRepository;

    public void saveUser(user u)
    {
        UserRepository.save(u);
    }

    public Map<Integer,String> findUserById(Integer id){
        return UserRepository.findByUserId(id);
    }

}
