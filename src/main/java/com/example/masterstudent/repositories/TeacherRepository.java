package com.example.masterstudent.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.masterstudent.models.TeacherModel;

@Repository
public interface TeacherRepository extends CrudRepository<TeacherModel, Long>{
    public abstract ArrayList<TeacherModel> findByTitle(String title);
    public abstract ArrayList<TeacherModel> findByStatus(String status);
}
