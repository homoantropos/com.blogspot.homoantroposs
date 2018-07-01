package com.blogspot.homoantroposs.StudentsTab.groups;

import com.blogspot.homoantroposs.StudentsTab.persons.Student;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupOfStudents implements Serializable {

    private String nameOfGroup;

    private ArrayList<Student> students = new ArrayList<>();

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

    public void addStudent (Student student) {
        students.add(student);
    }
}
