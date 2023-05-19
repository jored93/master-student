package com.example.masterstudent.models;

import javax.persistence.*;


@Entity
@Table(name = "studentHasSubject")
public class StudentHasSubjectModel extends BaseModel{
    
    @ManyToOne()
    @JoinColumn(name = "student_id")
    private StudentModel student;

    @ManyToOne()
    @JoinColumn(name = "subject_id")
    private SubjectModel subject;

    public StudentModel getStudent() {
        return student;
    }
    public void setStudent(StudentModel student) {
        this.student = student;
    }

    public SubjectModel getSubject() {
        return subject;
    }
    public void setSubject(SubjectModel subject) {
        this.subject = subject;
    }
}
