package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Memoryzator;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

import java.util.ArrayList;

public interface BaseManager {

    public ArrayList<GroupOfStudents> getBaseOfGroups ();

    public void addGroup (GroupOfStudents group);

    public void removeGroup(GroupOfStudents group);
}
