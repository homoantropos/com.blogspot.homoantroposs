package com.blogspot.homoantroposs.ArraysLessons.onemorelessons.base;

import java.util.Arrays;

public class MainArr {
    public static void main(String[] args) {
        String [] str = {"null", "one", "two", "three"};

        String [] str1 = new String[4];
        str1[0] = "for";
        str1[1] = "five";
        str1[2] = "six";
        str1[3] = "seven";

        String str2 [] = {"1", "2", "3"};

        for (String st : str)
            System.out.print(st + " ");

        System.out.println("");

        System.out.print(Arrays.toString(str1));

        System.out.println("");

        String [] str1Copy = str1;

        str1Copy[2] = "das";

        System.out.println("    str1=" + " " + Arrays.toString(str1));
        System.out.println("str1Copy=" + " " + Arrays.toString(str1Copy));

        System.arraycopy(str2, 1, str1Copy, 2, 2);

        System.out.println("");

        System.out.println("str1Copy =" + " " +  Arrays.toString(str1Copy));
        System.out.println("    str1=" + " " +  Arrays.toString(str1));

        String [] newStr = Arrays.copyOf(str, str.length + 2);
        System.out.println("newStr =" + " " + Arrays.toString(newStr));


//        BaseManager manager = new BaseManager();
//
//        GroupOfUser group = GroupManager.createTheGroup();
//        for (int i = 0; i < 4; i++) {
//            User user = UserCreator.createUser();
//            group.getUsers().add(user);
//        }
//        manager.addGroupToBase(group);
//
//        group = GroupManager.createTheGroup();
//        for (int i = 0; i < 4; i++) {
//            User user = UserCreator.createUser();
//            group.getUsers().add(user);
//        }
//        manager.addGroupToBase(group);
//
//        for (GroupOfUser gou : BaseOfGroups.getBase())
//            System.out.println(gou.getGroupName());
//
//        for (User b : manager.getList("хлопці").getUsers())
//            System.out.println(b);
//
//        for (User g : manager.getList("дівчата").getUsers())
//            System.out.println(g);
    }
}
class A {
    public A () {
        System.out.print("A");
        a();
    }
    public void a() {
        System.out.print("a");
    }
}

class B extends A {
    public B () {
        System.out.print("B");
        a();
        }
        public void a() {
            System.out.print("b");
        }
}

class Test {

    public Test (){
        A objA = new A();
        B objB = new B();
        test();
        System.out.print("Test");
    }
    public void test () {
        B objR = new B();
        objR.a();
        System.out.print("fin");
    }
        }