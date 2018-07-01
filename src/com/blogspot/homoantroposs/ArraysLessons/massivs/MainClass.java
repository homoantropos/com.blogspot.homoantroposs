package com.blogspot.homoantroposs.ArraysLessons.massivs;

import com.blogspot.homoantroposs.Utilites.ScannerHelper;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {


        Person [] persons = new Person [4];
        persons[0] = new Person ("Сергій", 47);
        persons[1] = new Person ("Петро", 13);
        persons[2] = new Person ("Василь", 29);
        persons[3] = new Person ("Микола", 90);

        System.out.println(Arrays.toString(persons));

        Integer [] mass1 = MassiveCreator.getMassiveN();
        Integer [] mass2 = MassiveCreator.createIntegerMass();
        Integer [] mass3 = MassiveCreator.createIntegerMass();

        System.out.println("mass2 = " + " " + Arrays.toString(mass2));

        System.out.println("mass3 = " + " " + Arrays.toString(mass3));

        System.out.println("mass1 = " + " " + Arrays.toString(mass1));
    }
}
