package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.user;

import java.util.List;

public interface userRepository extends JpaRepository<user, Integer>{

    List<user> findAll();



}
