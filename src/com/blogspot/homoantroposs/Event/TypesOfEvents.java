package com.blogspot.homoantroposs.Event;

public enum TypesOfEvents {

    DRILL ("тренування"),
    SEMINAR ("семінар"),
    ATTESTATION ("атестація"),
    COMPETITIONS ("змагання"),
    CAMP ("табір"),
    CELEBRATION ("святкування"),
    FESTIVAL ("фестиваль");

    String type;

    TypesOfEvents(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
