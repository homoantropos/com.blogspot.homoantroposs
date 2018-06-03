package com.blogspot.homoantroposs.ArraysLessons.massivs;

import java.io.Serializable;

public class Person implements Comparable <Person>, Serializable {

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person (String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo (Person p) {
        return this.getName().compareTo(p.getName());
    }

    @Override
    public String toString() {
        return String.format("%10s, %2d", name, age);
    }
}
