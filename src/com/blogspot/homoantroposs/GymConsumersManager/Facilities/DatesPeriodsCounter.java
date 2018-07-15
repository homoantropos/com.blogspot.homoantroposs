package com.blogspot.homoantroposs.GymConsumersManager.Facilities;

import java.time.LocalDate;
import java.util.Calendar;

public class DatesPeriodsCounter {

    private static final int DEVIDER = 1000*60*60*24;
    private static Calendar today = Calendar.getInstance();

    DatesPeriodsCounter() {}

    public static Integer ageCount (LocalDate dOB) {
        LocalDate today = LocalDate.now();
        Integer age = today.compareTo(dOB);
        if (dOB.getDayOfMonth() > today.getDayOfMonth()) {
            age = age - 1;
            return age;
        }
        return age;
    }

    public static Integer ageCountWithFixedLeapYears (Calendar dOB) {
        Integer age = ageCount(dOB);
        if ((dOB.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_MONTH)) == 1) {
            dOB.add(Calendar.DATE, -1);
            Integer ageBefore = ageCount(dOB);
            dOB.add(Calendar.DATE, 1);
            if (age == ageBefore) {
                age = ageBefore - 1;
                return age;
            }
        }
        return age;
    }

    private static Integer ageCount (Calendar dOB) {
        Long todayM = today.getTimeInMillis();
        Long dOBM = dOB.getTimeInMillis();
        Long ageM = todayM - dOBM;
        Long ageD = ageM/DEVIDER;
        Long leapYearIndex = ageD/1460;
        int age = (int)(ageD-leapYearIndex)/365;
        return age;
    }

    public static LocalDate getEndOfMonth (Integer monthLength) {
        LocalDate today = LocalDate.now();
        Integer year = today.getYear();
        Integer month = today.getMonthValue();
        LocalDate endOfMonth = LocalDate.of(year, month, monthLength);
        return endOfMonth;
    }
}
