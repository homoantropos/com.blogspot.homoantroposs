package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Amount;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

public interface AmountSet {

    public static void setAmount (Student student, Amount amount) {
        student.setAmount(amount);
    }
}
