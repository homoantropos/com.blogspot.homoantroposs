package com.blogspot.homoantroposs.GymConsumersManager;


import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Monitors.BaseOfGroupsMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Monitors.UserMonitor;

public class MainGCM extends BaseOfGroups {

    public static void main(String[] args) {

        BaseOfGroupsMonitor.printNamesAllGroups();
        BaseOfGroupsMonitor.printAllGroups();
    }
}
