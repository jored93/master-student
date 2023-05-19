package com.example.masterstudent.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class SubjectModel extends BaseModel{
    private String description;
    private Double points;

    @OneToMany(mappedBy = "subject")
    private List<StudentHasSubjectModel> studentsHasSubjects;

    public List<StudentHasSubjectModel> getStudentsHasSubjects() {
        return studentsHasSubjects;
    }
    public void setStudentsHasSubjects(List<StudentHasSubjectModel> studentsHasSubjects) {
        this.studentsHasSubjects = studentsHasSubjects;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPoints() {
        return points;
    }
    public void setPoints(Double points) {
        this.points = points;
    }
}
