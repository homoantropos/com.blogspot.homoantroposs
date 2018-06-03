package com.blogspot.homoantroposs.StudentsTab.base;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.io.Serializable;
import java.util.ArrayList;

public class BaseOfGroups implements Serializable {

    private static ArrayList <GroupOfStudents> baseOfGroups = new ArrayList<>();

    public BaseOfGroups () {}

    public static ArrayList<GroupOfStudents> getBase () {
        return baseOfGroups;
    }

    public static void setBase (ArrayList<GroupOfStudents> base) {
        baseOfGroups = base;
    }

}
