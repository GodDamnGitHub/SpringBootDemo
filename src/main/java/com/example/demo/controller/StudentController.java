package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/selectAll")
    public List<Student> selectAll() {
        return studentService.selectAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Student entity) {
        studentService.insert(entity);
    }
}
