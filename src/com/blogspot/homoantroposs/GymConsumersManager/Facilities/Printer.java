package com.blogspot.homoantroposs.GymConsumersManager.Facilities;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.User;

public class Printer {
    private Printer () {}

    public static void printAllGroups () {
        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups())
            System.out.println(gos.toString());
    }

    public static void printNamesAllGroups () {
        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups())
            System.out.println(String.format("| %3d. | %-40s | %-20s | наставник: %-17s |", (BaseOfGroups.getBaseOfGroups().indexOf(gos) + 1), gos.getGymAddress(), gos.getNameOfGroup(), gos.getTutors().get(0)));
    }

    public static String printUserFullInfo (User user) {
        StringBuilder userTostring = new StringBuilder();
        userTostring.append(String.format("%17s %-30s\n", "Учень:", user.toString()));
        userTostring.append(String.format("%17s %2$td.%2$tm.%2$ty\n", "дата народження:", user.getdOb()));
        userTostring.append(String.format("%17s %2$-3d %3$6s %4$1s\n", "вік:", user.getAge(), "стать:", user.getGender().getSex()));
        userTostring.append(String.format("%17s %-15s\n", "електронна пошта:", user.getMail()));
        userTostring.append(String.format("%17s %-15s\n", "адреса:", user.getAddress()));
        userTostring.append(String.format("%17s %-17s\n", "телефон 1:", user.getPhoneNumber()));
        userTostring.append(String.format("%17s %-17s\n", "телефон 2:", user.getExtraPhoneNumber()));

        return userTostring.toString();
    }

    public static String printUserFullInfoToRaw (User user) {
        StringBuilder userTostring = new StringBuilder();
        userTostring.append(String.format("|%30s | ", user.toString()));
        userTostring.append(String.format("%-17s | ", user.getPhoneNumber()));
        userTostring.append(String.format("%-17s |", user.getExtraPhoneNumber()));
        userTostring.append(String.format("%1$td.%1$tm.%1$ty | ", user.getdOb()));
        userTostring.append(String.format("%-3d | %2$1s | ", user.getAge(), user.getGender().getSex()));
        userTostring.append(String.format("%-15s | ", user.getMail()));
        userTostring.append(String.format("%-50s | ", user.getAddress()));


        return userTostring.toString();
    }
}
