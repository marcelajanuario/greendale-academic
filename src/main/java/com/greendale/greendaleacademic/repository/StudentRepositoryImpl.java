package com.greendale.greendaleacademic.repository;

import com.greendale.greendaleacademic.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(UUID.randomUUID(), "Brita Perry"));
        return students;
    }
}
