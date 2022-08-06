package com.example.demo.service;

import com.example.demo.dao.MajorDao;
import com.example.demo.model.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {
    @Autowired
    private MajorDao majorDao;

    public List<Major> selectAll() {
        return (List<Major>) majorDao.findAll();
    }

    public void insert(Major entity) {
        majorDao.save(entity);
    }
}
