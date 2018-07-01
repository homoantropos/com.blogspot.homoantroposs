package com.blogspot.homoantroposs.ArraysLessons.onemorelessons.base.groups;

import arrLessons.users.User;
import arrLessons.utilites.ScannerHelper;

public class GroupManager {

    GroupManager () {}

    public static arrLessons.groups.GroupOfUser createTheGroup () {
        System.out.println("Назва групи:");
        String nameOfGroup = ScannerHelper.inputStr();
        arrLessons.groups.GroupOfUser group = new arrLessons.groups.GroupOfUser(nameOfGroup);
        return group;
    }

    public static arrLessons.groups.GroupOfUser setUserInGroup (User user, arrLessons.groups.GroupOfUser group) {
        group.getUsers().add(user);
        return group;
    }

}
