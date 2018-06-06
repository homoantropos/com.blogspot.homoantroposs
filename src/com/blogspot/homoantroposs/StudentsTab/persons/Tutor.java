package com.blogspot.homoantroposs.StudentsTab.persons;

import com.blogspot.homoantroposs.StudentsTab.Event.Drill;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;
import com.blogspot.homoantroposs.StudentsTab.calendar.CalendarOfEvents;
import com.blogspot.homoantroposs.StudentsTab.interfaces.ManagerOfCalendar;

import java.time.LocalDate;
import java.util.ArrayList;

class Tutor extends User implements ManagerOfCalendar {

    Tutor (String firstName, String lastName, Boolean sex, LocalDate dOb, Integer age) {
        super(firstName, lastName, sex, dOb, age);
    }

    public void setRowOfEvents(LocalDate start, LocalDate end, ArrayList<LocalDate> daysOfWeek) {

    }

    public void setSingleEvent(LocalDate date, GroupOfStudents group) {
        Drill drill = new Drill (date, group);
        CalendarOfEvents.setEvent(drill);
    }
}
