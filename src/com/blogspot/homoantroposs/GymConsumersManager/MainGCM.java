package com.blogspot.homoantroposs.GymConsumersManager;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Managers.GroupsManager;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;

import java.time.LocalDate;

public class MainGCM extends BaseOfGroups {

    public static void main(String[] args) {

        LocalDate dOb = LocalDate.of(1971, 06, 8);
        Genders gender = Genders.MAIL;
        Student me = new Student ("Антропов", "Сергій", dOb, gender, "+38 050 657 67 41");
        me.setAddress("м. Київ, вул. Тростянецька, б. 8В, кв. 76");
        me.setMail("homoantropos@gmail.com");
        me.setExtraPhoneNumber("+38 063 657 67 41");
        System.out.println(me.printFullInfo());

        for (int i = 0; i < 5; i++)
        System.out.println(me.printFullInfoToRaw());

        Tutor meT = new Tutor ("Антропов", "Сергій", dOb, gender, "+38 050 657 67 41");

        GroupOfStudents group = new GroupOfStudents("Новачки", "Київ, вул. Древлянська, б. 8");

        for (int i = 0; i < 5; i++)
        GroupsManager.addTutor(group, meT);
        for (int i = 0; i < 5; i++)
        GroupsManager.addStudent(group, me);
        System.out.println(group.toString());

        GroupsManager.removeTutor(group, meT);
        System.out.println(group.toString());
    }
}
