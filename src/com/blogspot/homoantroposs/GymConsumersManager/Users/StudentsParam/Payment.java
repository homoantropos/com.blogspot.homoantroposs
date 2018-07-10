package com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam;

import java.time.LocalDate;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;

public class Payment {

    private PaymentCheck paymentCheck;
    private LocalDate month;
    private LocalDate payDay;

    public Payment(PaymentCheck paymentCheck, LocalDate month) {
        payDay = LocalDate.now();
        this.paymentCheck = paymentCheck;
        this.month = month;
    }
}
