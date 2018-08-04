package com.blogspot.homoantroposs;

import com.blogspot.homoantroposs.LessonsDifferent.A;
import com.blogspot.homoantroposs.LessonsDifferent.B;
import com.blogspot.homoantroposs.Utilites.DatesPeriodsCounter;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class MainForLessons {
    public static void main(String[] args) {
        A a = new A ();
        B b = new B();

        BotherPackage bother = new BotherPackage();
        bother.testPackage(a, bother);

        AnotherPackage an = new AnotherPackage();

//        Integer month = 6;
//        for (int year = 1920; year < 2019; year ++) {
//            for (int day = 14; day<19; day++){
//                LocalDate dOB = LocalDate.of(year, month, day);
//                Integer age = DatesPeriodsCounter.ageCount(dOB);
//                System.out.println(String.format("%1$td.%1$tm.%1$ty %2$3d", dOB, age));
//            }
//            System.out.println("");
//        }
    }
}
