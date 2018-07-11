package com.blogspot.homoantroposs.GymConsumersManager.Enums;

import java.io.Serializable;

public enum Genders implements Serializable {

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
