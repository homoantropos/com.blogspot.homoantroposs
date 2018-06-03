package com.blogspot.homoantroposs.StudentsTab.persons;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Comparable<User>, Serializable {
    private String firstName;
    private String lastName;
    private Boolean sex;
    private LocalDate dOb;
    private Integer age;

    public User(String firstName, String lastName, Boolean sex, LocalDate dOb, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dOb = dOb;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public LocalDate getdOb() {
        return dOb;
    }

    public void setdOb(LocalDate dOb) {
        this.dOb = dOb;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString () {
        return String.format("%8s %7s %2d %7s %4d %2d", getFirstName(), getLastName(), getdOb().getDayOfMonth(), getdOb().getMonth(), getdOb().getYear(), getAge());
    }

    public int compareTo(User u) {
        return this.getLastName().compareTo(u.getLastName());
    }
}
