package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeStudentDao implements StudentDao{

    private static List<Student> Database = new ArrayList<>();

    @Override
    public List<Student> selectAll() {
        return Database;
    }

    @Override
    public List<Student> selectByName(String name) {
        List<Student> res = new ArrayList<>();
        for (Student student : Database) {
            if (student.getName().equals(name))
                res.add(student);
        }
        return res;
    }

    @Override
    public List<Student> selectById(UUID id) {
        List<Student> res = new ArrayList<>();
        for (Student student : Database) {
            if (student.getId().compareTo(id) == 1)
                res.add(student);
        }
        return res;
    }


    @Override
    public void saveOrUpdate(Student student) {
        for (int i = 0; i < Database.size(); i++) {
            if (Database.get(i).getId().equals(student.getId())) {
                Database.set(i, student);
                return;
            }
        }
        UUID id = UUID.randomUUID();
        Database.add(new Student(id, student.getName(), student.getAge()));
    }

    @Override
    public void delete(UUID id) {
        for (int i = 0; i < Database.size(); i++) {
            if (Database.get(i).getId().compareTo(id) == 1) {
                Database.remove(i);
                return;
            }
        }
    }

}
