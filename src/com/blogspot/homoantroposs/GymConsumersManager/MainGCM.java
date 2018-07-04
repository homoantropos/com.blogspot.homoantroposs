package com.blogspot.homoantroposs.GymConsumersManager;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

public class MainGCM {

    public static void main(String[] args) {
        GroupOfStudents group = new GroupOfStudents("Новачки", "Київ, вул. Древлянська, б. 8");
        System.out.println(group.toString());
    }
}
