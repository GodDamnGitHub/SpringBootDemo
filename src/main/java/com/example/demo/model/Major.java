package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="majors")
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, name="name")
    private String name;
    @Column(nullable = false, name="school")
    private String school;

    public Major(String name, String school) {
        //this.id = id;
        this.name = name;
        this.school = school;
    }

    public long getId() {
        return id;
    }
    public String getName() {return name;}
    public String getSchool() {return school;}
}
