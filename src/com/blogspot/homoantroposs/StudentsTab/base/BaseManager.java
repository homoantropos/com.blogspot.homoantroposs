package com.blogspot.homoantroposs.StudentsTab.base;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BaseManager {

    GroupOfStudents group1;

    public BaseManager() {}

    public void addGroup (GroupOfStudents group) {

        BaseOfGroups.getBase().add(group);
        try {
            FileOutputStream fos = new FileOutputStream("base.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(BaseOfGroups.getBase());
            oos.close();
        }catch (IOException e) {
            System.out.println("Файл не знайдено.");
        }
    }

    public void changeGroup (GroupOfStudents group) {
        String nameOfGroup = group.getNameOfGroup();
        for (GroupOfStudents gos : BaseOfGroups.getBase()) {
            if (nameOfGroup.equals(gos.getNameOfGroup()))
                group1 = gos;
        }
                BaseOfGroups.getBase().remove(group1);
        BaseOfGroups.getBase().add(group);
        try {
            FileOutputStream fos = new FileOutputStream("base.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(BaseOfGroups.getBase());
            oos.close();
        }catch (IOException e) {
            System.out.println("Файл не знайдено.");
        }
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
                group1 = BaseOfGroups.getBase().get(index);
            }
        }
        return group1;
    }

}
