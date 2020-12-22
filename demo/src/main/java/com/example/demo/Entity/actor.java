package com.example.demo.Entity;

import javax.persistence.*;
import lombok.*;

import lombok.extern.log4j.Log4j;

@Entity
@Data
@Table(name = "actor")
public class actor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name="actorID") //指定和表中cust_id字段的映射关系
    private int actorID;

    @Column(name="name")
    private String name;

    @Column(name="photo")
    private String photo;

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
