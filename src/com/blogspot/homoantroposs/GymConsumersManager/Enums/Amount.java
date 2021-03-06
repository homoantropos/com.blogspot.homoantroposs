package com.blogspot.homoantroposs.GymConsumersManager.Enums;

import java.io.Serializable;

public enum Amount implements Serializable {

    PERSONAL (0),
    MAXIMUM (0),
    MEDIUM (0),
    REDUSED (0),
    FREE (0);

    Amount (Integer quontity) {
        this.quontity = quontity;
    }

    private Integer quontity;

    public Integer getQuontity() {
        return quontity;
    }

    public void setQuontity(Integer quontity) {
        this.quontity = quontity;
    }
}
