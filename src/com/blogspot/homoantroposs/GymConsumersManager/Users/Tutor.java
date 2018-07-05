package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Amount;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Payment;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.AmountSet;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.AttendanceCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.GroupsManager;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.PaymentCheck;

import java.time.LocalDate;

public class Tutor extends User implements GroupsManager, AttendanceCheck, PaymentCheck, AmountSet {

    public Tutor(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        super(firstName, name, dOb, sex, phoneNumber);
    }

}
