package com.example.masterstudent.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.masterstudent.models.StudentModel;
import com.example.masterstudent.services.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<StudentModel> getAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping( path = "/{id}")
    public Optional<StudentModel> getTeacherById(@PathVariable("id") Long id) {
        return this.studentService.getStudentById(id);
    }

    @PostMapping()
    public StudentModel addStudent(@RequestBody StudentModel student) {
        return studentService.addStudent(student);
    }
}
