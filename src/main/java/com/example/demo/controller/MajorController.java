package com.example.demo.controller;

import com.example.demo.model.Major;
import com.example.demo.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/major")
public class MajorController {
    @Autowired
    private MajorService majorService;

    @GetMapping("/selectAll")
    public List<Major> selectAll() {
        //return new LinkedList<>();
        return majorService.selectAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Major entity) {
        majorService.insert(entity);
    }

}
