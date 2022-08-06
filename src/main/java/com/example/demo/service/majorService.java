package com.example.demo.service;

import com.example.demo.dao.majorDao;
import com.example.demo.model.major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class majorService {
    @Autowired
    private majorDao dao;

    public List<major> selectAll() {
        return (List<major>) dao.findAll();
    }

    public void insert(major entity) {
        dao.save(entity);
    }
}
