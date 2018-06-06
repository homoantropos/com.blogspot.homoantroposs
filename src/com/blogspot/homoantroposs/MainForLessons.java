package com.blogspot.homoantroposs;

import com.blogspot.homoantroposs.StudentsTab.utilites.AgeCounter;
import com.blogspot.homoantroposs.Utilites.DatesPeriodsCounter;

import java.util.Calendar;
import java.time.LocalDate;

public class MainForLessons {
    public static void main(String[] args) {

        Integer month = 6;
        for (int year = 1920; year < 2019; year ++) {
            for (int day = 4; day<9; day++){
                LocalDate dOB = LocalDate.of(year, month, day);
                Integer age = DatesPeriodsCounter.ageCount(dOB);
                System.out.println(String.format("%tD %3d", dOB, age));
            }
            System.out.println("");
        }
    }
}
