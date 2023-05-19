package com.example.masterstudent.models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class TeacherModel extends BaseModel {
    private String name;
    private String lastname;
    private String title;

    @OneToMany(mappedBy = "teacher")
    private List<StudentModel> students;

    public List<StudentModel> getStudents() {
        return students;
    }
    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
