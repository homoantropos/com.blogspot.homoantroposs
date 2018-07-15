package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.AttendanceCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Memoryzator;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.*;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.DatesMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Payment;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

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
        if (group.getTutors().contains(this)) {
            group.setNameOfGroup(nameOfGroup);
            Memoryzator.passBaseOfGroupToMemory();
        } else {
            System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void changeAdressOfGym (GroupOfStudents group, String gymAdress) {
        if (group.getTutors().contains(this)) {
            group.setGymAddress(gymAdress);
            Memoryzator.passBaseOfGroupToMemory();
        } else {System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void addStudent (GroupOfStudents group, Student student) {
        if (group.getTutors().contains(this)) {
            if (!group.getStudents().contains(student)) {
                group.getStudents().add(student);
                Collections.sort(group.getStudents());
                Memoryzator.passBaseOfGroupToMemory();
            } else {
                System.out.println("Цей Учень вже є в цій групі");
            }
        }
        else {
            System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void removeStudent (GroupOfStudents group, Student student) {
        if (group.getTutors().contains(this)) {
            group.getStudents().remove(student);
            Collections.sort(group.getStudents());
            Memoryzator.passBaseOfGroupToMemory();
        }
        else {
            System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void addTutor (GroupOfStudents group, Tutor tutor) {
        if (group.getTutors().contains(this)) {
            if(!group.getTutors().contains(tutor)){
                group.getTutors().add(tutor);
                Memoryzator.passBaseOfGroupToMemory();
            } else {
                System.out.println("Цей Наставник вже є в групі");
            }
        } else {
            System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void removeTutor (GroupOfStudents group, Tutor tutor) {
        if (group.getTutors().contains(this)) {
            if(group.getTutors().contains(tutor)){
                group.getTutors().remove(tutor);
                Memoryzator.passBaseOfGroupToMemory();
            } else {
                System.out.println("Наставника не знайдено");
            }
        } else {
            System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void checkAttendance (GroupOfStudents group, Student student, AttendanceCheck attendanceCheck) {
        if (group.getTutors().contains(this)) {
            Attendance attendance = new Attendance(attendanceCheck, group.getNameOfGroup(), this.toString(), group.getGymAddress());
            if (!student.getAttendance().contains(attendance)) {
                student.getAttendance().add(attendance);
                Memoryzator.passBaseOfGroupToMemory();
            }
        }else {
            System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");
        }
    }

    public void checkPayment (GroupOfStudents group, Student student, PaymentCheck paymentCheck, DatesMonitor month, Integer amount) {
        if (group.getTutors().contains(this)) {
            Payment payment = new Payment(paymentCheck, month, amount);
            for (Payment p : student.getPayment())
                if (p.getMonth().equals(month)) {
                amount = amount + p.getAmout();
                payment = new Payment(paymentCheck, month, amount);
                }
            student.getPayment().add(payment);
            Memoryzator.passBaseOfGroupToMemory();
        }else {System.out.println("Ви не можете редагувати цю групу, зверніться до адміністратора.");}
    }

}
