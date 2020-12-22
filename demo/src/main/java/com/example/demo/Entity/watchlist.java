package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "watchlist")
public class watchlist implements Serializable {
    @Id
    @Column(name = "userID")
    private int userID;

    @Id
    @Column(name = "movieID")
    private int movieID;

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

}
