package com.greendale.greendaleacademic.controller;

import com.greendale.greendaleacademic.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(UUID.randomUUID(), "Abed Nadir"));

        return students;

    }



}
