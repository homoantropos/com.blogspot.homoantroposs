package com.blogspot.homoantroposs.StudentsTab.base;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

public class BaseManager {

    GroupOfStudents group;

    public BaseManager() {}

    public void addGroup (GroupOfStudents group) {
        BaseOfGroups.getBase().add(group);
    }

    public GroupOfStudents getGroupOfStudents (GroupOfStudents group) {
        Integer index = BaseOfGroups.getBase().indexOf(group);
        group = BaseOfGroups.getBase().get(index);
        return group;
    }

    public GroupOfStudents getGroupOfStudents (String nameOfGroup) {
        for (GroupOfStudents gof : BaseOfGroups.getBase()) {
            if (gof.getNameOfGroup().equals(nameOfGroup)) {
                Integer index = BaseOfGroups.getBase().indexOf(gof);
                group = BaseOfGroups.getBase().get(index);
            }
        }
        return group;
    }

}
