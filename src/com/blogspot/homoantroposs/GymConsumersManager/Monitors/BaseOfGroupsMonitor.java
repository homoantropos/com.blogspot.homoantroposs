package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

public class BaseOfGroupsMonitor {

    BaseOfGroupsMonitor () {}

    public static String showAllGroups() {
        StringBuilder baseNames = new StringBuilder();
        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups())
            baseNames.append(gos.toString()+'\n');
        return baseNames.toString();
    }

    public static String showOnlyNamesAllGroups() {
        StringBuilder allBase = new StringBuilder();
        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups())
            allBase.append(String.format("| %3d. | %-40s | %-20s | наставник: %-17s |", (BaseOfGroups.getBaseOfGroups().indexOf(gos) + 1), gos.getGymAddress(), gos.getNameOfGroup(), gos.getTutors().get(0)) + '\n');
    return allBase.toString();
    }
}
