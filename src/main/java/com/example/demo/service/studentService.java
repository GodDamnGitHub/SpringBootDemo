package com.example.demo.service;

import com.example.demo.dao.studentDao;
import com.example.demo.model.major;
import com.example.demo.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    private studentDao dao;

    public List<student> selectAll() {
        return (List<student>) dao.findAll();
    }

    public void insert(student entity) {
        dao.save(entity);
    }
}
