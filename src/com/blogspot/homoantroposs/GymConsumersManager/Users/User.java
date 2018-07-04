package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.Utilites.DatesPeriodsCounter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public abstract class User implements Serializable, Comparable <User> {

    private String firstName;
    private String name;
    private LocalDate dOb;
    private Integer age;
    private Genders sex;
    private String mail;
    private String phoneNumber;
    private String extraPhoneNumber;
    private String address;

    public User(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        this.firstName = firstName;
        this.name = name;
        this.dOb = dOb;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getdOb() {
        return dOb;
    }

    public void setdOb(LocalDate dOb) {
        this.dOb = dOb;
    }

    public Integer getAge() {
        this.age = DatesPeriodsCounter.ageCount(dOb);
        return age;
    }

    public Genders getSex() {
        return sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExtraPhoneNumber() {
        return extraPhoneNumber;
    }

    public void setExtraPhoneNumber(String extraPhoneNumber) {
        this.extraPhoneNumber = extraPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int compareTo (User u) {
        return this.firstName.compareTo(u.firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getdOb(), user.getdOb()) &&
                Objects.equals(getAge(), user.getAge()) &&
                getSex() == user.getSex() &&
                Objects.equals(getMail(), user.getMail()) &&
                Objects.equals(getPhoneNumber(), user.getPhoneNumber()) &&
                Objects.equals(getExtraPhoneNumber(), user.getExtraPhoneNumber()) &&
                Objects.equals(getAddress(), user.getAddress());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getName(), getdOb());
    }

    @Override
    public String toString() {
        return (String.format("%7s %7s", firstName, name));
    }
}
