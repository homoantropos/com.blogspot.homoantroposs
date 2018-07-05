package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

public interface BaseManager {

    public static void addGroup (GroupOfStudents group) {
        BaseOfGroups.getBaseOfGroups().add(group);
    }

    public static void deleteGroup (GroupOfStudents group) {
        BaseOfGroups.getBaseOfGroups().remove(group);
    }
}
