package com.example.masterstudent.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.masterstudent.models.StudentModel;
import com.example.masterstudent.repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public ArrayList<StudentModel> getStudents(){
        return (ArrayList<StudentModel>) studentRepository.findAll();
    }

    public Optional<StudentModel> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public ArrayList<StudentModel> getStudentsByStatus(String status){
        return (ArrayList<StudentModel>) studentRepository.findByStatus(status);
    }

    public StudentModel addStudent(StudentModel student){
        return studentRepository.save(student);
    }
}
