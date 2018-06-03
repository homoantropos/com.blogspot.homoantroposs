package com.blogspot.homoantroposs.StudentsTab.utilites;

import java.time.LocalDate;

public class AgeCounter {

    static private Integer age;

    public static Integer ageCount (LocalDate dOb) {
        LocalDate date = LocalDate.now();
        int age = date.compareTo(dOb);
        return age;
    }
}
