package com.blogspot.homoantroposs.GymConsumersManager;


import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Printer;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;

import java.time.LocalDate;

public class MainGCM extends BaseOfGroups {

    public static void main(String[] args) {
        Student arsen = new Student("Антропов", "Арсен", LocalDate.of(2005, 03, 9), Genders.MAIL, "відсутній");
        Tutor tutor = BaseOfGroups.getBaseOfGroups().get(0).getTutors().get(0);
        tutor.addStudent(BaseOfGroups.getBaseOfGroups().get(0), arsen);
        Printer.printNamesAllGroups();
        Printer.printAllGroups();
    }
}
