package com.blogspot.homoantroposs.SerializationLesson.Group;

import com.blogspot.homoantroposs.SerializationLesson.Facilities.Quizzer;

public class GroupCreator {

    private GroupCreator () {}

    public static GroupOfPersons createTheGroup () {
        System.out.println("Введіть назву групи:");
        String nameOfGroup = Quizzer.askName();
        GroupOfPersons group = new GroupOfPersons(nameOfGroup);
        return group;
    }
}
