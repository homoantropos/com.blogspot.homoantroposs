package com.blogspot.homoantroposs.GymConsumersManager.Enums;

import java.io.Serializable;

public enum Months implements Serializable {
    JANYARY ("СІЧЕНЬ"),
    FEBRYARY ("ЛЮТИЙ"),
    MARCH ("БЕРЕЗЕНЬК"),
    APRIL ("КВІТЕНЬ"),
    MAY ("ТРАВЕНЬ"),
    JUNE ("ЧЕРВЕНЬ"),
    JULY ("ЛИПЕНЬ"),
    AUGUST ("СЕРПЕНЬ"),
    SEPTEMBER ("ВЕРЕСЕНЬ"),
    OCTOBER ("ЖОВТЕНЬ"),
    NOVEMBER ("ЛИСТОПАД"),
    DECEMBER ("ГРУДЕНЬ");

    private String monthUK;

    private Months (String monthUK) {
        this.monthUK = monthUK;
    }

    public String getMonthUK() {
        return monthUK;
    }

    public void setMonthUK(String monthUK) {
        this.monthUK = monthUK;
    }
}
