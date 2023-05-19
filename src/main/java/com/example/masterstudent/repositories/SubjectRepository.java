package com.example.masterstudent.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.masterstudent.models.SubjectModel;

public interface SubjectRepository extends CrudRepository <SubjectModel, Long>{
    public abstract ArrayList<SubjectModel> findByStatus(String status);
    public abstract ArrayList<SubjectModel> findByPoints(Double points);
}
