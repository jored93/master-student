package com.example.masterstudent.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.masterstudent.models.SubjectModel;
import com.example.masterstudent.repositories.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public ArrayList<SubjectModel> getSubjects(){
        return (ArrayList<SubjectModel>) subjectRepository.findAll();
    }

    public Optional<SubjectModel> getSubjectById(Long id){
        return subjectRepository.findById(id);
    }

    public ArrayList<SubjectModel> getSubjectByStatus(String status){
        return (ArrayList<SubjectModel>) subjectRepository.findByStatus(status);
    }

    public ArrayList<SubjectModel> getSubjectByPoint(Double points){
        return (ArrayList<SubjectModel>) subjectRepository.findByPoints(points);
    }

    public SubjectModel addSubject(SubjectModel subject){
        return subjectRepository.save(subject);
    }
}
