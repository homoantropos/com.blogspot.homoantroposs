package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Months;

import java.time.LocalDate;

public class DatesMonitor {

    private DatesMonitor () {}

    public static String showMonthName (LocalDate date) {
        String nameOfMonth = date.getMonth().toString();
        for (Months m : Months.values()) {
            if (m.toString().equals(nameOfMonth)){
                nameOfMonth = m.getMonthUK();
            }
        }
        return nameOfMonth;
    }
}
