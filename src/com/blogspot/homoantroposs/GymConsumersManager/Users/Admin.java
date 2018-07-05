package com.blogspot.homoantroposs.GymConsumersManager.Users;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.BaseManager;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.GroupsManager;

import java.time.LocalDate;

public class Admin extends User implements BaseManager, GroupsManager {

    public Admin(String firstName, String name, LocalDate dOb, Genders sex, String phoneNumber) {
        super(firstName, name, dOb, sex, phoneNumber);
    }


}
