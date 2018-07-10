package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.AttendanceCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Memoryzator;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.*;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Payment;

import java.time.LocalDate;

public class Tutor extends User implements GroupsManager, AttendanceMark, PaymentMark, AmountSet {

    public Tutor(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        super(firstName, name, dOb, sex, phoneNumber);
    }

    public Tutor (User user) {
        this.setFirstName(user.getFirstName());
        this.setName(user.getName());
        this.setdOb(user.getdOb());
        this.setGender(user.getGender());
        this.setPhoneNumber(user.getPhoneNumber());
    }

    public Tutor () {}

    public GroupOfStudents creatTheGroup (String nameOfGroup, String gymAddress) {
        GroupOfStudents group = new GroupOfStudents(nameOfGroup, gymAddress, this);
            if (!BaseOfGroups.getBaseOfGroups().contains(group)) {
                BaseOfGroups.getBaseOfGroups().add(group);
                Memoryzator.passBaseOfGroupToMemory();
            }
            else {
                group = null;
                System.out.println("Така група вже існує.");
            }
        return group;
    }

    public void changeNameOfGroup (GroupOfStudents group, String nameOfGroup) {
        group.setNameOfGroup(nameOfGroup);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void changeAdressOfGym (GroupOfStudents group, String gymAdress) {
        group.setGymAddress(gymAdress);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void addStudent (GroupOfStudents group, Student student) {
        if (!group.getStudents().contains(student)) {
            group.getStudents().add(student);
            Memoryzator.passBaseOfGroupToMemory();
        } else {
            System.out.println("Цей Учень вже є в цій групі");
        }
    }

    public void removeStudent (GroupOfStudents group, Student student) {
        group.getStudents().remove(student);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void addTutor (GroupOfStudents group, Tutor tutor) {

    }

    public void removeTutor (GroupOfStudents group, Tutor tutor) {

    }

    public void checkAttendance (GroupOfStudents group, Student student, AttendanceCheck attendanceCheck) {
        Attendance attendance = new Attendance(attendanceCheck, group.getNameOfGroup(), this.toString(), group.getGymAddress());
        student.getAttendance().add(attendance);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void checkPayment (Student student, PaymentCheck paymentCheck, LocalDate month) {
        Payment payment = new Payment (paymentCheck, month);
        student.getPayment().add(payment);
        Memoryzator.passBaseOfGroupToMemory();
    }

}
