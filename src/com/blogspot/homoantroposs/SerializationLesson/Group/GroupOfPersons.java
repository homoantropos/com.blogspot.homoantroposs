package com.blogspot.homoantroposs.SerializationLesson.Group;

import com.blogspot.homoantroposs.SerializationLesson.Person.Person;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupOfPersons implements Serializable {

    private String nameOfGroup;
    private ArrayList<Person> group;

    public GroupOfPersons(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
        this.group = new ArrayList<>();
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public ArrayList<Person> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Person> group) {
        this.group = group;
    }

}
