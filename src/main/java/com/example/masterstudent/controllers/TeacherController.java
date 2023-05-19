package com.example.masterstudent.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.masterstudent.models.TeacherModel;
import com.example.masterstudent.services.TeacherService;


@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping()
    public ArrayList<TeacherModel> getTeachers(){
        return teacherService.getTeachers();
    }

    @PostMapping()
    public TeacherModel addTeacher(@RequestBody TeacherModel Teacher){
        return this.teacherService.addTeacher(Teacher);
    }

    @GetMapping( path = "/{id}")
    public Optional<TeacherModel> getTeacherById(@PathVariable("id") Long id) {
        return this.teacherService.getTeacherById(id);
    }

    @GetMapping("/findByTitle")
    public ArrayList<TeacherModel> getTeacherByTitle(@RequestParam("title") String title){
        return this.teacherService.getTeacherByTitle(title);
    }

    @GetMapping("/findByStatus")
    public ArrayList<TeacherModel> getTeacherByStatus(@RequestParam("status") String status){
        return this.teacherService.getTeacherByStatus(status);
    }

    @PutMapping( path = "/{id}")
    public TeacherModel LogicDeleteById(@PathVariable("id") Long id){
        return this.teacherService.LogicDeleteById(id);
    }
}
