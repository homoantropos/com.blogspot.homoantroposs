package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Months;

import java.io.Serializable;
import java.time.LocalDate;

public class DatesMonitor implements Serializable {

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

    public static Integer showNumberOfMonth (String nameOfMonth) {
        Integer numberOfMonth = 0;
        for (Months m : Months.values()) {
            if (m.getMonthUK().equals(nameOfMonth)) {
                numberOfMonth = m.getMonthValue();
            }
        }
        return numberOfMonth;
    }

    public static String showNameOfMonth (Integer numberOfMonth) {
        String nameOfMonth = "СІЧЕНЬ";
        for (Months m : Months.values()) {
            if (m.getMonthValue().equals(numberOfMonth))
                nameOfMonth = m.getMonthUK();
        }
        return nameOfMonth;
    }
}
