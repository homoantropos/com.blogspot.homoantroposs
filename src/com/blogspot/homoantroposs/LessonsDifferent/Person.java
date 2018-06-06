package com.blogspot.homoantroposs.LessonsDifferent;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person> {

    private String name;

    Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo (Person person) {
        return this.name.compareTo(person.getName());
    }

    public String toString () {
        return String.format("%10s", name);
    }
}
