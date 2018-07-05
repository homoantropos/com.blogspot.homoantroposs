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
    private Genders gender;
    private String mail;
    private String phoneNumber;
    private String extraPhoneNumber;
    private String address;

    public User(String firstName, String name, LocalDate dOb, Genders gender, String phoneNumber) {
        this.firstName = firstName;
        this.name = name;
        this.dOb = dOb;
        this.gender = gender;
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

    public Genders getGender() {
        return gender;
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

    public String printFullInfo () {
        StringBuilder userTostring = new StringBuilder();
        userTostring.append(String.format("%17s %-30s\n", "Учень:", toString()));
        userTostring.append(String.format("%17s %2$td.%2$tm.%2$ty\n", "дата народження:", dOb));
        userTostring.append(String.format("%17s %2$-3d %3$6s %4$1s\n", "вік:", getAge(), "стать:", getGender().getSex()));
        userTostring.append(String.format("%17s %-15s\n", "електронна пошта:", mail));
        userTostring.append(String.format("%17s %-15s\n", "адреса:", address));
        userTostring.append(String.format("%17s %-17s\n", "телефон 1:", phoneNumber));
        userTostring.append(String.format("%17s %-17s\n", "телефон 2:", extraPhoneNumber));

        return userTostring.toString();
    }

    public String printFullInfoToRaw () {
        StringBuilder userTostring = new StringBuilder();
        userTostring.append(String.format("|%30s | ", toString()));
        userTostring.append(String.format("%-17s | ", phoneNumber));
        userTostring.append(String.format("%-17s |", extraPhoneNumber));
        userTostring.append(String.format("%1$td.%1$tm.%1$ty | ", dOb));
        userTostring.append(String.format("%-3d | %2$1s | ", getAge(), getGender().getSex()));
        userTostring.append(String.format("%-15s | ", mail));
        userTostring.append(String.format("%-50s | ", address));


        return userTostring.toString();
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
                getGender() == user.getGender() &&
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
        return (firstName + " " + name);
    }
}
