package com.blogspot.homoantroposs.StudentsTab.groups;

import com.blogspot.homoantroposs.StudentsTab.persons.Student;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupOfStudents extends ArrayList<Student> implements Serializable {

    private String nameOfGroup;

    private ArrayList<Student> students;

    public GroupOfStudents(String nameOfGroup) {

        this.nameOfGroup = nameOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public void setStudents(ArrayList<Student> students) {

        this.students = students;
    }
}
