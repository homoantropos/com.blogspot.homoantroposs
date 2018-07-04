package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Amount;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Payment;
import com.blogspot.homoantroposs.GymConsumersManager.Interfaces.AmountSet;
import com.blogspot.homoantroposs.GymConsumersManager.Interfaces.AttendanceCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Interfaces.PaymentCheck;

import java.time.LocalDate;

public class Tutor extends User implements AttendanceCheck, PaymentCheck, AmountSet {

    public Tutor(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        super(firstName, name, dOb, sex, phoneNumber);
    }

    public void checkAttendance (Student student, Attendance attendance) {
        student.setAttendance(attendance);
    }

    public void checkPayment (Student student, Payment payment) {
        student.setPayment(payment);
    }

    public void setAmount (Student student, Amount amount) {
        student.setAmount(amount);
    }

}
