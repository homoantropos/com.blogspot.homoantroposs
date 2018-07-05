package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Amount;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Payment;

import java.time.LocalDate;

public class Student extends User {

    private Attendance attendance;
    private Payment payment;
    private Amount amount;

    public Student(String firstName, String name, LocalDate dOb, Genders gender, String phoneNumber) {
        super(firstName, name, dOb, gender, phoneNumber);
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }


}
