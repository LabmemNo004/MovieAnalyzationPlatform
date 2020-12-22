package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "director")
public class director {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name="directorID") //指定和表中cust_id字段的映射关系
    private int directorID;

    @Column(name="name")
    private String name;

    @Column(name="photo")
    private String photo;

    public void setDirectorID(int directorID) {
        this.directorID = directorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public int getDirectorID() {
        return directorID;
    }

    public String getName() {
        return name;
    }

}
