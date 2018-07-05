package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;

public interface GroupsManager {

    static public void changeNameOfGroup (GroupOfStudents group, String nameOfGroup) {
        group.setNameOfGroup(nameOfGroup);
    }

    static public void changeAdressOfGym (GroupOfStudents group, String gymAdress) {
        group.setGymAddress(gymAdress);
    }

    static public void addStudent (GroupOfStudents group, Student student) {
        group.getStudents().add(student);
    }

    static public void removeStudent (GroupOfStudents group, Student student) {
        group.getStudents().remove(student);
    }

    static public void addTutor (GroupOfStudents group, Tutor tutor) {
        group.getTutors().add(tutor);
    }

    static public void removeTutor (GroupOfStudents group, Tutor tutor) {
        group.getTutors().remove(tutor);
    }

}
