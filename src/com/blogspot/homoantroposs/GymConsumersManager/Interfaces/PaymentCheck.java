package com.blogspot.homoantroposs.GymConsumersManager.Interfaces;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Payment;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

public interface PaymentCheck {

    public void checkPayment (Student student, Payment payment);
}
