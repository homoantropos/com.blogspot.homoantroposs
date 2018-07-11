package com.blogspot.homoantroposs.GymConsumersManager.Enums;

import java.io.Serializable;

public enum PaymentCheck implements Serializable {
    PAID ('+'),
    OWING ('-');

    private final Character paymentCheck;

    PaymentCheck (Character paymentCheck) { this.paymentCheck = paymentCheck; }

}
