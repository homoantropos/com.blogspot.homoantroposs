package com.blogspot.homoantroposs.GymConsumersManager.Enums;

import java.io.Serializable;

public enum Months implements Serializable {
    JANYARY ("СІЧЕНЬ", 1),
    FEBRYARY ("ЛЮТИЙ", 2),
    MARCH ("БЕРЕЗЕНЬК", 3),
    APRIL ("КВІТЕНЬ", 4),
    MAY ("ТРАВЕНЬ", 5),
    JUNE ("ЧЕРВЕНЬ", 6),
    JULY ("ЛИПЕНЬ", 7),
    AUGUST ("СЕРПЕНЬ", 8),
    SEPTEMBER ("ВЕРЕСЕНЬ", 9),
    OCTOBER ("ЖОВТЕНЬ", 10),
    NOVEMBER ("ЛИСТОПАД", 11),
    DECEMBER ("ГРУДЕНЬ", 12);

    private String monthUK;
    private Integer monthValue;

    private Months (String monthUK, Integer monthValue) {
        this.monthUK = monthUK;
        this.monthValue = monthValue;
    }

    public String getMonthUK() {
        return monthUK;
    }

    public void setMonthUK(String monthUK) {
        this.monthUK = monthUK;
    }

    public Integer getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(Integer monthValue) {
        this.monthValue = monthValue;
    }
}
