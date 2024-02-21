package com.ysquare.SpringJDBCExample.service;

import com.ysquare.SpringJDBCExample.Repo.StudentRepo;
import com.ysquare.SpringJDBCExample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {
        System.out.println("Student Added....");
        repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
