package com.blogspot.homoantroposs.ArraysLessons.massivs;

import java.time.*;
import java.io.*;

public class Event implements Comparable<Event>, Serializable {

    private String name;
    private LocalDate date;

    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%10s %16s", name, date.toString());
    }

    public int compareTo (Event ev) {
        return this.date.compareTo(ev.date);
    }
}
