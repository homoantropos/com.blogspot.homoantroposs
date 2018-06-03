package com.blogspot.homoantroposs.StudentsTab.events;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.time.LocalDate;

public class Drill {

    private LocalDate date;
    private GroupOfStudents group;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public GroupOfStudents getGroup() {
        return group;
    }

    public void setGroup(GroupOfStudents group) {
        this.group = group;
    }

    public Drill(LocalDate date, GroupOfStudents group) {

        this.date = date;
        this.group = group;
    }
}
