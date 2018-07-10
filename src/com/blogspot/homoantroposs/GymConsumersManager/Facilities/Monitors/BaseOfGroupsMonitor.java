package com.blogspot.homoantroposs.GymConsumersManager.Facilities.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

public class BaseOfGroupsMonitor {

    BaseOfGroupsMonitor () {}

    public static void printAllGroups () {
        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups())
            System.out.println(gos.toString());
    }

    public static void printNamesAllGroups () {
        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups())
            System.out.println(String.format("| %3d. | %-40s | %-20s | наставник: %-17s |", (BaseOfGroups.getBaseOfGroups().indexOf(gos) + 1), gos.getGymAddress(), gos.getNameOfGroup(), gos.getTutors().get(0)));
    }
}
