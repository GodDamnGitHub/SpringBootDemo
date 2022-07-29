package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {
    List<Student> selectAll();

    List<Student> selectByName(String name);

    List<Student> selectById(UUID id);

    void saveOrUpdate(Student student);

    void delete(UUID id);



}
