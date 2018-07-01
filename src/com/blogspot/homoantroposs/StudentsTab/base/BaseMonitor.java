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

    public static String printOfBaseToString () {
        StringBuilder strB = new StringBuilder();
        for (GroupOfStudents gos : BaseOfGroups.getBase()) {
            strB.append ((BaseOfGroups.getBase().indexOf(gos)+1)+ "." + " " + gos.getNameOfGroup() + " " + gos.getStudents().size() + "\n");
        }
        return strB.toString();
    }

    public static void printOfGroup (String nameOfGroup){
        for (GroupOfStudents gof : BaseOfGroups.getBase()) {
            if (gof.getNameOfGroup().equals(nameOfGroup)) {
                Integer index = BaseOfGroups.getBase().indexOf(gof);
                GroupOfStudents group = BaseOfGroups.getBase().get(index);
                for (Student student : group.getStudents()) {
                    System.out.println(student.toString());
                }
            }
        }
    }

    public static String printOfGroupToString (String nameOfGrouo) {
        StringBuilder strB = new StringBuilder();
        for (GroupOfStudents gof : BaseOfGroups.getBase()) {
            if (gof.getNameOfGroup().equals(nameOfGrouo)) {
                Integer index = BaseOfGroups.getBase().indexOf(gof);
                GroupOfStudents group = BaseOfGroups.getBase().get(index);
                for (Student student : group.getStudents()) {
                    strB.append((group.getStudents().indexOf(student) + 1) + " " + student.toString() + "\n");
                }
            }
        }

        return strB.toString();
    }

}
