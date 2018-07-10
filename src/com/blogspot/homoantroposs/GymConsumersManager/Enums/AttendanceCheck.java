package com.blogspot.homoantroposs.GymConsumersManager.Enums;

public enum AttendanceCheck {
    PRESENT ('+'),
    ABSENT ('н');

    private final Character attendCheck;

    AttendanceCheck(Character attendCheck){ this.attendCheck = attendCheck; }

    public Character getAttendCheck() {
        return attendCheck;
    }
}
