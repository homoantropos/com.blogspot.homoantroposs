package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

import java.io.Serializable;
import java.time.LocalDate;

public interface Accountant extends Serializable {
    public void showAllPayments (LocalDate startOfPeriod, LocalDate endOfPeriod);
    public void showPaymentsByGroup(GroupOfStudents group, LocalDate startOfPeriod, LocalDate endOfPeriod);
    public void showPaymentsByStudent(Student student, LocalDate startOfPeriod, LocalDate endOfPeriod);
}
