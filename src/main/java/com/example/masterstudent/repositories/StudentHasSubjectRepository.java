package com.example.masterstudent.repositories;


import org.springframework.data.repository.CrudRepository;


import com.example.masterstudent.models.StudentHasSubjectModel;

public interface StudentHasSubjectRepository extends CrudRepository<StudentHasSubjectModel, Long>{
    
}
