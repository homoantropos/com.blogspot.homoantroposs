package com.blogspot.homoantroposs.LessonsDifferent;

import com.blogspot.homoantroposs.LessonsDifferent.A;

public class B extends A {

    public int publicB = 0;
    int packageB = 0;
    protected int protectedB = 0;
    private int privateB = 0;

    public void testAccessnew (A a, B b) {
        a.publicI = 1;
        a.packageI = 1;
        a.protectedI = 1;
        System.out.println("publicI = " + publicI);
        System.out.println("packageI = " + packageI);
        System.out.println("protectedI = " + protectedI);
        b.publicB = 2;
        b.packageB = 2;
        b.protectedB = 2;
        b.privateB = 2;

    }
}
