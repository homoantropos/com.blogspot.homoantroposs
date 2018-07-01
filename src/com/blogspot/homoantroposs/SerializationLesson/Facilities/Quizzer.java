package com.blogspot.homoantroposs.SerializationLesson.Facilities;

import com.blogspot.homoantroposs.Utilites.ScannerHelper;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Quizzer {

    public Quizzer () {}

    public static String askName () {
        String name = ScannerHelper.askStr();
        return name;
    }

    public static LocalDate askDob () {
        System.out.println("Рік народження:");
        Integer year = ScannerHelper.askInt();
        System.out.println("мівсяць народження");
        Integer month = ScannerHelper.askInt();
        System.out.println("день народження:");
        Integer day = ScannerHelper.askInt();
        LocalDate dOb = LocalDate.of(year, month, day);
        return dOb;
    }
}
