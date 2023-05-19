package com.example.masterstudent.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class StudentModel extends BaseModel{

    private String name;
    private String lastname;

    @ManyToOne()
    @JoinColumn(name = "master_id")
    private TeacherModel teacher;

    public TeacherModel getMaster() {
        return teacher;
    }
    public void setMaster(TeacherModel teacher) {
        this.teacher = teacher;
    }

    @OneToMany(mappedBy = "student")
    private List<StudentHasSubjectModel> studentsHasSubjects;

    public List<StudentHasSubjectModel> getStudentsHasSubjects() {
        return studentsHasSubjects;
    }
    public void setStudentsHasSubjects(List<StudentHasSubjectModel> studentsHasSubjects) {
        this.studentsHasSubjects = studentsHasSubjects;
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
}
