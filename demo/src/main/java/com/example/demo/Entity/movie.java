package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "movie")
public class movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name="movieID") //指定和表中cust_id字段的映射关系
    private int movieID;

    @Column(name="title")
    private String title;

    @Column(name="productNum")
    private int productNum;

    @Column(name="directorNum")
    private int directorNum;

    @Column(name="actorNum")
    private int actorNum;

    @Column(name="score")
    private float score;

    @Column(name="comment")
    private String comment;

    @Column(name="type")
    private String type;

    @Column(name="price")
    private float price;

    @Column(name="publishTime")
    private String publishTime;

    @Column(name="photo")
    private String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getPrice() {
        return price;
    }

    public float getScore() {
        return score;
    }

    public int getActorNum() {
        return actorNum;
    }

    public int getDirectorNum() {
        return directorNum;
    }

    public int getMovieID() {
        return movieID;
    }

    public int getProductNum() {
        return productNum;
    }

    public String getComment() {
        return comment;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public void setActorNum(int actorNum) {
        this.actorNum = actorNum;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDirectorNum(int directorNum) {
        this.directorNum = directorNum;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

}
