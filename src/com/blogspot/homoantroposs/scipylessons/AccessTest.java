package com.blogspot.homoantroposs.scipylessons;

public final class AccessTest {

    protected int privateField = 0;

    public AccessTest () {
        System.out.println(" superclass ");
    }

    private void testAccess(AccessTest anotherObject){
        anotherObject.privateField = 1;
        System.out.println("anotherObject.getPrivateField()="+anotherObject.getPrivateField() );
        System.out.println("anotherObject.privateField="+anotherObject.privateField );
    }

    private int getPrivateField(){
        return privateField;
    }

    public void testAccsess (AccessTest anotherObject) {
        this.testAccess(anotherObject);
    }
    private class inSideM {

    }
}