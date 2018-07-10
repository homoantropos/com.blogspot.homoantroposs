package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Memoryzator;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.BaseManager;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.GroupsManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class Admin extends Tutor implements BaseManager {

    public Admin(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        super(firstName, name, dOb, sex, phoneNumber);
    }

    public Admin (Tutor tutor) {
        this.setFirstName(tutor.getFirstName());
        this.setName(tutor.getName());
        this.setdOb(tutor.getdOb());
        this.setGender(tutor.getGender());
        this.setPhoneNumber(tutor.getPhoneNumber());
    }

    public ArrayList<GroupOfStudents> getBaseOfGroups () {
        return BaseOfGroups.getBaseOfGroups();
    }

    public void addGroup (GroupOfStudents group) {
        BaseOfGroups.getBaseOfGroups().add(group);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void removeGroup(GroupOfStudents group) {
        BaseOfGroups.getBaseOfGroups().remove(group);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void addTutor (GroupOfStudents group, Tutor tutor) {
        group.getTutors().add(tutor);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void removeTutor (GroupOfStudents group, Tutor tutor) {
        group.getTutors().remove(tutor);
        Memoryzator.passBaseOfGroupToMemory();
    }

}
