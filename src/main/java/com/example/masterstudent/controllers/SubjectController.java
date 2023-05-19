package com.example.masterstudent.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.masterstudent.models.SubjectModel;
import com.example.masterstudent.services.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    
    @Autowired
    SubjectService subjectService;

    @GetMapping()
    public List<SubjectModel> getAllSubjects() {
        return subjectService.getSubjects();
    }

    @GetMapping("/{id}")
    public Optional<SubjectModel> getSubjectById(@PathVariable Long id) {
        return subjectService.getSubjectById(id);
    }

    @PostMapping()
    public SubjectModel addStudent(@RequestBody SubjectModel subject) {
        return subjectService.addSubject(subject);
    }
}
