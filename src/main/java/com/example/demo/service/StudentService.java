package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentService {

    private StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    public List<Student> selectByName(String name) {
        return studentDao.selectByName(name);
    }

    public List<Student> selectById(UUID id) {
        return studentDao.selectById(id);
    }

    public void saveOrUpdate(Student student) {
        studentDao.saveOrUpdate(student);
    }

    public void delete(UUID id) {
        studentDao.delete(id);
    }
}
