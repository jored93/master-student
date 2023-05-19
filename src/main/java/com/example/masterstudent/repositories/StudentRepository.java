package com.example.masterstudent.repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;


import com.example.masterstudent.models.StudentModel;

public interface StudentRepository extends CrudRepository<StudentModel, Long>{
    public abstract ArrayList<StudentModel> findByStatus(String status);
}
