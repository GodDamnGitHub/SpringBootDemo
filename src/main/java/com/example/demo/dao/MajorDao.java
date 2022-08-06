package com.example.demo.dao;

import com.example.demo.model.Major;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorDao extends CrudRepository<Major, Long> {
}
