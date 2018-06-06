package com.blogspot.homoantroposs.StudentsTab.calendar;

import com.blogspot.homoantroposs.StudentsTab.Event.Drill;

import java.util.ArrayList;

public class CalendarOfEvents {

    private static ArrayList <Drill>  events = new ArrayList<>();

    CalendarOfEvents() {
    }

    static ArrayList<Drill> getEvents() {
        return events;
    }

    public static void setEvent (Drill drill) {
        events.add(drill);
    }

}
