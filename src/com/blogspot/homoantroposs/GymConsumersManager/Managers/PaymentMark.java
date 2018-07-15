package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.DatesMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Payment;

import java.io.Serializable;
import java.time.LocalDate;

public interface PaymentMark {

    public void checkPayment (GroupOfStudents group, Student student, PaymentCheck paymentCheck, DatesMonitor month, Integer amount);
}
