package com.example.masterstudent.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.masterstudent.models.TeacherModel;
import com.example.masterstudent.repositories.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public ArrayList<TeacherModel> getTeachers(){
        return (ArrayList<TeacherModel>)teacherRepository.findAll();
    }

    public TeacherModel addTeacher(TeacherModel teacher){
        teacher.setStudents(null);
        return teacherRepository.save(teacher);
    }

    public Optional<TeacherModel> getTeacherById(Long id){
        return teacherRepository.findById(id);
    }

    public ArrayList<TeacherModel>  getTeacherByTitle(String title) {
        return teacherRepository.findByTitle(title);
    }

    public ArrayList<TeacherModel>  getTeacherByStatus(String status) {
        return teacherRepository.findByStatus(status);
    }

    public TeacherModel LogicDeleteById(Long id ) {
        TeacherModel teacher = teacherRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Teacher not found"));
        final String newStatus = "I";
        teacher.setStatus(newStatus);
        return teacherRepository.save(teacher);
        }
}
