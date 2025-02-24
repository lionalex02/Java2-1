package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
        this.likes = 0;
    }

    public Integer getLikes() {
        return this.likes;
    }
    public String getText() {
        return this.text;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public Long getId(){
        return id;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
