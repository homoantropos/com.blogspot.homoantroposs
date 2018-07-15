package com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam;

import java.io.Serializable;
import java.time.LocalDate;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.DatesMonitor;

public class Payment implements Serializable {

    private PaymentCheck paymentCheck;
    private DatesMonitor month;
    private LocalDate payDay;
    private Integer amout;

    public Payment(PaymentCheck paymentCheck, DatesMonitor month, Integer amount) {
        payDay = LocalDate.now();
        this.paymentCheck = paymentCheck;
        this.month = month;
        this.amout = amount;
    }

    public PaymentCheck getPaymentCheck() {
        return paymentCheck;
    }

    public void setPaymentCheck(PaymentCheck paymentCheck) {
        this.paymentCheck = paymentCheck;
    }

    public DatesMonitor getMonth() {
        return month;
    }

    public void setMonth(DatesMonitor month) {
        this.month = month;
    }

    public LocalDate getPayDay() {
        return payDay;
    }

    public void setPayDay(LocalDate payDay) {
        this.payDay = payDay;
    }

    public Integer getAmout() {
        return amout;
    }

    public void setAmout(Integer amout) {
        this.amout = amout;
    }
}
