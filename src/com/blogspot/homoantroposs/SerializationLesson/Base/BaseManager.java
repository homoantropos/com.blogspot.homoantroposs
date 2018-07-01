package com.blogspot.homoantroposs.SerializationLesson.Base;

import com.blogspot.homoantroposs.SerializationLesson.Group.GroupOfPersons;

public class BaseManager {

    public static void addGroup (GroupOfPersons group) {
        BaseOfGroups.getBase().add(group);
    }

    public static GroupOfPersons getGroup (String nameOfGroup) {
        GroupOfPersons group = new GroupOfPersons(nameOfGroup);
        for (GroupOfPersons gr : BaseOfGroups.getBase()) {
            if (gr.getNameOfGroup().equals(nameOfGroup)) {
                Integer index = BaseOfGroups.getBase().indexOf(gr);
                group = BaseOfGroups.getBase().get(index);
            }
        }
        return group;
    }
}
