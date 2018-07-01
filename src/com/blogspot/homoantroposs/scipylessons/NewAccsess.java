package com.blogspot.homoantroposs.scipylessons;

public class NewAccsess {
    private int x;
    private AccessTest accessTest;

    NewAccsess (AccessTest accessTest) {
        this.accessTest = accessTest;
        x = accessTest.privateField;
        System.out.println(" newaccess ");
    }

    public int getX() {
        return x;
    }

    public AccessTest getAccessTest() {
        return accessTest;
    }

}
