package com.greendale.greendaleacademic.repository;

import com.greendale.greendaleacademic.pojo.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> getAll();
}
