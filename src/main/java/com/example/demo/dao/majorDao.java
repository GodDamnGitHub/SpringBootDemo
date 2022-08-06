package com.example.demo.dao;

import com.example.demo.model.major;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface majorDao extends CrudRepository<major, Long> {
}
