package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name="userID") //指定和表中cust_id字段的映射关系
    private int userID;

    @Column(name="profileName") //指定和表中cust_id字段的映射关系
    private String profileName;

    @Column(name="password") //指定和表中cust_id字段的映射关系
    private String password;

    @Column(name="photo") //指定和表中cust_id字段的映射关系
    private String photo;

    public user(String profileName, String password, String photo) {

        this.profileName = profileName;
        this.password = password;
        this.photo = photo;
    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoto() {
        return photo;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

}
