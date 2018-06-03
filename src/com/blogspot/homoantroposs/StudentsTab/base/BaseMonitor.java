package com.blogspot.homoantroposs.StudentsTab.base;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;
import com.blogspot.homoantroposs.StudentsTab.persons.Student;

public class BaseMonitor {

    BaseMonitor () {}

    public static void printOfBase () {
        for (GroupOfStudents gof : BaseOfGroups.getBase()){
            System.out.println(gof.getNameOfGroup());
        }
    }

    public static void printOfGroup (String nameOfGroup){
        for (GroupOfStudents gof : BaseOfGroups.getBase()) {
            if (gof.getNameOfGroup().equals(nameOfGroup)) {
                Integer index = BaseOfGroups.getBase().indexOf(gof);
                GroupOfStudents group = BaseOfGroups.getBase().get(index);
                for (Student student : group) {
                    System.out.println(student.toString());
                }
            }
        }
    }

}
