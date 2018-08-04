package com.blogspot.homoantroposs.LessonsDifferent;

import com.blogspot.homoantroposs.AnotherPackage;
import com.blogspot.homoantroposs.BotherPackage;

public class MainFormodifictors {

    public static void main(String[] args) {
        A a = new A ();
        A a2 = new A ();

        B b2 = new B ();
        B b = new B ();

        BotherPackage bOther = new BotherPackage();
        BotherPackage bother2 = new BotherPackage();

        AnotherPackage an = new AnotherPackage();
        AnotherPackage an2 = new AnotherPackage();

        A as = new B ();
        A aother = new BotherPackage();

        a.protectedI = 2;
        a.packageI = 3;
        a.publicI = 4;
        a.testAccess(bOther);

        a.getPackageI(a2);
        bOther.getProtectedI(a);
        an.getProtectedI(a);
        b.getPackageI(b2);

        a.getProtectedI(a2);

    }
}
