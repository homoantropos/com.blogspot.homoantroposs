package com.blogspot.homoantroposs.StudentsTab.persons;

import com.blogspot.homoantroposs.StudentsTab.interfaces.Attendance;
import com.blogspot.homoantroposs.StudentsTab.interfaces.PaymentsCheck;

import java.time.LocalDate;

public class Student extends User implements PaymentsCheck, Attendance {

    private Integer amount;
    private Boolean attendance;
    private Boolean paymentsCheck;

    public Student(String firstName, String lastName, Boolean sex, LocalDate dOb, Integer age) {
        super(firstName, lastName, sex, dOb, age);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public boolean getAttendance() {
        return false;
    }

    public void setAttendance() {

    }

    public Boolean getPaymentsCheck() {
        return paymentsCheck;
    }

    public void setPaymentsCheck (Boolean paymentsCheck) {
        this.paymentsCheck = paymentsCheck;
    }

}
