package com.blogspot.homoantroposs.SerializationLesson.Group;

import com.blogspot.homoantroposs.SerializationLesson.Person.Person;

public class GroupsManager {

    private GroupsManager () {}

    public static void addPerson (GroupOfPersons group, Person person) {
        group.getGroup().add(person);
    }
}
