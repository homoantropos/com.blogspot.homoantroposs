package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.PaymentCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Payment;

import java.time.LocalDate;

public interface PaymentMark {

    public void checkPayment (Student student, PaymentCheck paymentCheck, LocalDate month);
}
