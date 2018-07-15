package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.AttendanceCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Memoryzator;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.BaseManager;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.GroupsManager;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.Accountant;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.DatesMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Payment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Admin extends Tutor implements BaseManager, Accountant {

    public Admin(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        super(firstName, name, dOb, sex, phoneNumber);
    }

    public Admin (Tutor tutor) {
        this.setFirstName(tutor.getFirstName());
        this.setName(tutor.getName());
        this.setdOb(tutor.getdOb());
        this.setGender(tutor.getGender());
        this.setPhoneNumber(tutor.getPhoneNumber());
    }

    public ArrayList<GroupOfStudents> getBaseOfGroups () {
        return BaseOfGroups.getBaseOfGroups();
    }

    public void addGroup (GroupOfStudents group) {
        if (!BaseOfGroups.getBaseOfGroups().contains(group)) {
            BaseOfGroups.getBaseOfGroups().add(group);
            Memoryzator.passBaseOfGroupToMemory();
        }else {
            System.out.println("Така група вже існує");
        }
    }

    public void removeGroup(GroupOfStudents group) {
        BaseOfGroups.getBaseOfGroups().remove(group);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void changeNameOfGroup (GroupOfStudents group, String nameOfGroup) {
        group.setNameOfGroup(nameOfGroup);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void changeAdressOfGym (GroupOfStudents group, String gymAdress) {
        group.setGymAddress(gymAdress);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void addTutor (GroupOfStudents group, Tutor tutor) {
        if (!group.getTutors().contains(tutor)){
            group.getTutors().add(tutor);
            Memoryzator.passBaseOfGroupToMemory();
        }else {
            System.out.println("Цей Наставник вже є в складі наставників групи");
        }
    }

    public void removeTutor (GroupOfStudents group, Tutor tutor) {
        group.getTutors().remove(tutor);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void addStudent (GroupOfStudents group, Student student) {
        if (!group.getStudents().contains(student)) {
            group.getStudents().add(student);
            Collections.sort(group.getStudents());
            Memoryzator.passBaseOfGroupToMemory();
        } else {
            System.out.println("Цей Учень вже є в цій групі");
        }
    }

    public void removeStudent (GroupOfStudents group, Student student) {
            group.getStudents().remove(student);
            Collections.sort(group.getStudents());
            Memoryzator.passBaseOfGroupToMemory();
    }

    public void checkAttendance (GroupOfStudents group, Student student, AttendanceCheck attendanceCheck) {
        Attendance attendance = new Attendance(attendanceCheck, group.getNameOfGroup(), this.toString(), group.getGymAddress());
        if (!student.getAttendance().contains(attendance)) {
            student.getAttendance().add(attendance);
            Memoryzator.passBaseOfGroupToMemory();
        }
    }

    public void checkPayment (GroupOfStudents group, Student student, PaymentCheck paymentCheck, DatesMonitor month, Integer amount) {
        Payment payment = new Payment(paymentCheck, month, amount);
        student.getPayment().add(payment);
        Memoryzator.passBaseOfGroupToMemory();
    }

    public void showAllPayments (LocalDate startOfPeriod, LocalDate endOfPeriod) {

    }

    public void showPaymentsByGroup(GroupOfStudents group, LocalDate startOfPeriod, LocalDate endOfPeriod) {

    }

    public void showPaymentsByStudent(Student student, LocalDate startOfPeriod, LocalDate endOfPeriod) {

    }
}
