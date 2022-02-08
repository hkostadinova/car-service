package com.informatics.cscb869f2020week3.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

//@Getter
//@Setter
//@NoArgsConstructor
@Entity
@Where(clause = "deleted = 0")
@Table(name = "school")
public class School extends BaseEntity {

    private String name;

    private int maxNumberOfStudents;

    private boolean isHighSchool;

    @OneToMany(mappedBy = "school")
    @JsonIgnoreProperties("school")
    private List<Teacher> teachers;

    private int deleted = 0;

    public School() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public boolean isHighSchool() {
        return isHighSchool;
    }

    public void setHighSchool(boolean highSchool) {
        isHighSchool = highSchool;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", maxNumberOfStudents=" + maxNumberOfStudents +
                ", isHighSchool=" + isHighSchool +
                ", deleted=" + deleted +
                "} " + super.toString();
    }
}