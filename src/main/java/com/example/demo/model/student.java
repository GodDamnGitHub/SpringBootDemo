package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, name="name")
    private String name;
    @Column(nullable = false, name="gender")
    private String gender;
    @Column(nullable = false, name="major")
    private String major;
    @Column(nullable = false, name="score")
    private int score;


    public student(Long id, String name, String gender, String major, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.major = major;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }



    public int getScore() {
        return score;
    }
}
