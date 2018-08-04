package com.blogspot.homoantroposs.LessonsDifferent;

public class A {
    public int publicI = 0;
    int packageI = 0;
    protected int protectedI = 0;
    private int privateI = 0;

    public A () {}

    public void testAccess(A a) {
        a.publicI = 1;
        a.packageI = 1;
        a.protectedI = 1;
        a.privateI = 1;
        System.out.println("publicI = " + publicI);
        System.out.println("packageI = " + packageI);
        System.out.println("protectedI = " + protectedI);
        System.out.println("privateI = " + privateI);
    }

    int getPackageI (A a) {
        return packageI;
    }

    protected int getProtectedI (A a) {
        return protectedI;
    }

    private int getPrivateI (A a) {
        return privateI;
    }

    public int getPublicI (A a) {
        return publicI;
    }
}
