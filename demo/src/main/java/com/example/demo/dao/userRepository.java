package com.example.demo.dao;


import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.user;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface userRepository extends JpaRepository<user, Integer>{

    List<user> findAll();

    @Query(value = "select userID,password from user where userID=?1",nativeQuery = true)
    Map<Integer,String> findByUserId(Integer id);

}
