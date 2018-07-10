package com.blogspot.homoantroposs.GymConsumersManager.Enums;

public enum PaymentCheck {
    PAID ('+'),
    OWING ('-');

    private final Character paymentCheck;

    PaymentCheck (Character paymentCheck) { this.paymentCheck = paymentCheck; }

}
