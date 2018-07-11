package com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam;

import java.io.Serializable;
import java.time.LocalDate;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;

public class Payment implements Serializable {

    private PaymentCheck paymentCheck;
    private LocalDate month;
    private LocalDate payDay;

    public Payment(PaymentCheck paymentCheck, LocalDate month) {
        payDay = LocalDate.now();
        this.paymentCheck = paymentCheck;
        this.month = month;
    }
}
