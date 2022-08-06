package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> selectAll() {
        return (List<Student>) studentDao.findAll();
    }

    public void insert(Student entity) {
        studentDao.save(entity);
    }
}
