package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @RequestMapping("/selectAll")
    public List<Student> selectAll() {
        return studentService.selectAll();
    }

    @GetMapping
    @RequestMapping("/selectByName")
    public List<Student> selectByName(@RequestParam("name") String name) {
        return studentService.selectByName(name);
    }


    @PostMapping
    @RequestMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
    }

    @PostMapping
    @RequestMapping("/delete")
    public void delete(@RequestParam("id") UUID id) {
        studentService.delete(id);
    }

}
