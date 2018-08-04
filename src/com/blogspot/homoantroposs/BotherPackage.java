package com.blogspot.homoantroposs;

import com.blogspot.homoantroposs.LessonsDifferent.A;

public class BotherPackage extends A {

    public int publicB = 0;
    int packageB = 0;
    protected int protectedB = 0;
    private int privateB = 0;

    public void testAccessnew (A a, BotherPackage b) {
        a.publicI = 1;
        System.out.println("publicI = " + a.publicI);
        b.publicB = 2;
        b.packageB = 2;
        b.protectedB = 2;
        b.privateB = 2;

    }

    protected void testPackage (A a, BotherPackage b) {
    }
}
