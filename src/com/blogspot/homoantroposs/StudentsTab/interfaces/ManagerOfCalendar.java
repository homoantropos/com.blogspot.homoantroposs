package com.blogspot.homoantroposs.StudentsTab.interfaces;


import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ManagerOfCalendar {

    public void setSingleEvent(LocalDate date, GroupOfStudents group);

    public void setRowOfEvents (LocalDate start, LocalDate end, ArrayList<LocalDate> daysOfWeek);
}
