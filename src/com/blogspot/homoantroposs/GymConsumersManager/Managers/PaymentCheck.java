package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Payment;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

public interface PaymentCheck {

    public static void checkPayment (Student student, Payment payment) {
        student.setPayment(payment);
    }
}
