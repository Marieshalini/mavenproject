package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/lms")
public class Hello {

    // GET all courses
    @GetMapping("/courses")
    public List<String> getCourses() {
        return Arrays.asList("Java", "DBMS", "DevOps");
    }

    // ADD new course
    @PostMapping("/addCourse")
    public String addCourse(@RequestParam String course) {
        return course + " added successfully";
    }

    // GET students
    @GetMapping("/students")
    public List<String> getStudents() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }
}