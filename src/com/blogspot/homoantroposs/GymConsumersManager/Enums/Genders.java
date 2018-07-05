package com.blogspot.homoantroposs.GymConsumersManager.Enums;

public enum Genders {

    MAIL ('ч'),
    FEMAIL ('ж');

    Character sex;

    Genders () {}

    private Genders (Character sex) {
        this.sex = sex;
    }

    public Character getSex() {
        return sex;
    }
}
