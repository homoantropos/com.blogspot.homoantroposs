package com.blogspot.homoantroposs.GymConsumersManager.Groups;

import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class GroupOfStudents implements Serializable {

    private String nameOfGroup;
    private String gymAddress;
    private ArrayList<Tutor> tutors;
    private ArrayList<Student> students;

    public GroupOfStudents(String nameOfGroup, String gymAddress) {
        this.nameOfGroup = nameOfGroup;
        this.gymAddress = gymAddress;

        tutors = new ArrayList<>();
        students = new ArrayList<>();
    }

    private GroupOfStudents () {}

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public String getGymAddress() {
        return gymAddress;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public void setGymAddress(String gymAddress) {
        this.gymAddress = gymAddress;
    }

    public ArrayList<Tutor> getTutors() {
        return tutors;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupOfStudents)) return false;
        GroupOfStudents that = (GroupOfStudents) o;
        return Objects.equals(getNameOfGroup(), that.getNameOfGroup()) &&
                Objects.equals(getTutors(), that.getTutors()) &&
                Objects.equals(getStudents(), that.getStudents());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameOfGroup(), getTutors(), getStudents());
    }

    @Override
    public String toString() {

        StringBuilder groupToString = new StringBuilder();
        groupToString.append(String.format("%-11s %-12s \n\n", "Група:", nameOfGroup));
        groupToString.append(String.format("%-11s %-30s \n\n", "Зал:", gymAddress));
        groupToString.append(String.format("%-11s \n", "Наставники:"));
        Integer count1 = 1;
        for (Tutor t : tutors) {
            groupToString.append(String.format("%11d %-30s\n", count1, t.toString()));
            count1++;
        }
        groupToString.append(String.format("\n%-11s %-30s\n", "Склад:", "Прізвище" + " " + "ім'я"));
        Integer count2 = 1;
        for (Student s : students) {
            groupToString.append(String.format("%11d %-30s\n", count2, s.toString()));
            count2++;
        }

        return groupToString.toString();
    }
}
