package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;

public interface GroupsManager {

    public GroupOfStudents creatTheGroup (String nameOfGroup, String gymAddress);

    public void changeNameOfGroup (GroupOfStudents group, String nameOfGroup);

    public void changeAdressOfGym (GroupOfStudents group, String gymAdress);

    public <T> void addStudent (GroupOfStudents group, T student);

    public <T> void removeStudent (GroupOfStudents group, T student);

    public void addTutor (GroupOfStudents group, Tutor tutor);

    public void removeTutor (GroupOfStudents group, Tutor tutor);

}
