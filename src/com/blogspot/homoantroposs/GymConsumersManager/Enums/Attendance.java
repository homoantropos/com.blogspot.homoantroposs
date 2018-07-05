package com.blogspot.homoantroposs.GymConsumersManager.Enums;

public enum Attendance {

    PRESENT (' '),
    ABSENT ('н');

    Character att;

    private Attendance (Character att) {
        this.att = att;
    }

    Attendance () {}

    public Character getAtt() {
        return att;
    }

}
