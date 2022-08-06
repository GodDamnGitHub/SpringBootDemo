package com.example.demo.controller;

import com.example.demo.model.major;
import com.example.demo.service.majorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping("/api/major")
public class majorController {
    @Autowired
    private majorService service;

    @GetMapping("/selectAll")
    public List<major> selectAll() {
        //return new LinkedList<>();
        return service.selectAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody major entity) {
        service.insert(entity);
    }

}
