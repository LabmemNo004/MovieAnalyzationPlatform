package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class user {
    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name="userID") //指定和表中cust_id字段的映射关系
    private int userID;

    @Column(name="profileName") //指定和表中cust_id字段的映射关系
    private String profileName;

    @Column(name="password") //指定和表中cust_id字段的映射关系
    private String password;

    @Column(name="photo") //指定和表中cust_id字段的映射关系
    private String photo;

    @Column(name="role")
    private Integer role;

    @Column(name="sex")
    private Integer sex;

    @Column(name="birthday")
    private Date birthday;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="signature")
    private String signature;



    public user() {
    }



    public user(int userID, String profileName,
                String password, String photo,
                Integer role, Integer sex, Date birthday,
                String phone, String email, String signature) {
        this.userID = userID;
        this.profileName = profileName;
        this.password = password;
        this.photo = photo;
        this.role = role;
        this.sex = sex;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.signature = signature;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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
