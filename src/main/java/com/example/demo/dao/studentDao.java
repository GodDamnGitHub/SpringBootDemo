package com.example.demo.dao;

import com.example.demo.model.student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentDao extends CrudRepository<student, Long> {
}
