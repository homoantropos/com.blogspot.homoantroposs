package com.blogspot.homoantroposs.GymConsumersManager.Groups;

import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

public class GroupsManager {

    private GroupsManager() {}

    static public void addStudent (GroupOfStudents group, Student student) {
        group.getStudents().add(student);
    }
}
