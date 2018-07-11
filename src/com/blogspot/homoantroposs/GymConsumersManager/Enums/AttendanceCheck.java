package com.blogspot.homoantroposs.GymConsumersManager.Enums;

import java.io.Serializable;

public enum AttendanceCheck implements Serializable {
    PRESENT ('+'),
    ABSENT ('н');

    private final Character attendCheck;

    AttendanceCheck(Character attendCheck){ this.attendCheck = attendCheck; }

    public Character getAttendCheck() {
        return attendCheck;
    }
}
