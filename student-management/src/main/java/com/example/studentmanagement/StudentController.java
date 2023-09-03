package com.example.studentmanagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db=new HashMap<>();

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return db.get(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNo(),student);
        return "Student has been added successfully";
    }
}
