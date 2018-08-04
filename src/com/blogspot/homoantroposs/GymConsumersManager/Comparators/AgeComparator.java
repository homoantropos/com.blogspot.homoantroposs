package com.blogspot.homoantroposs.GymConsumersManager.Comparators;

import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.User;

import java.io.Serializable;
import java.util.Comparator;

public class AgeComparator implements Comparator<User>, Serializable {
    public int compare (User u1, User u2) {
        return u1.getAge().compareTo(u2.getAge());
    }
}
