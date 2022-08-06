package com.example.demo.controller;

import com.example.demo.model.student;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class studentController {
    @Autowired
    private studentService service;

    @GetMapping("/selectAll")
    public List<student> selectAll() {
        return service.selectAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody student entity) {
        service.insert(entity);
    }
}
