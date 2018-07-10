package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Amount;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Payment;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends User {

    private ArrayList<Attendance> attendances;
    private ArrayList<Payment> paymentChecks;
    private Amount amount;

    public Student(String firstName, String name, LocalDate dOb, Genders gender, String phoneNumber) {
        super(firstName, name, dOb, gender, phoneNumber);
        attendances = new ArrayList<>();
        paymentChecks = new ArrayList<>();
    }

    public ArrayList<Attendance> getAttendance() {
        return attendances;
    }

    public void setAttendance(ArrayList<Attendance> attendances) {
        this.attendances = attendances;
    }

    public ArrayList<Payment> getPayment() {
        return paymentChecks;
    }

    public void setPayment(ArrayList<Payment> paymentChecks) {
        this.paymentChecks = paymentChecks;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }


}
