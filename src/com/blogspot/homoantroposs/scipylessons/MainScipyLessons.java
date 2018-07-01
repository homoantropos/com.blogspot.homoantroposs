package com.blogspot.homoantroposs.scipylessons;

public class MainScipyLessons {
    public static void main(String[] str) {
        outer:
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
            for (int j = 0; j < 2; j++) {
                System.out.println(j);
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer");
        }
        System.out.println("Good-Bye");
    }
}