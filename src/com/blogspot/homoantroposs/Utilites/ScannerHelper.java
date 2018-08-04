package com.blogspot.homoantroposs.Utilites;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHelper {

    private ScannerHelper () {}

    public static String askStr() {
        Scanner inPut = new Scanner (System.in);
        String inStr = inPut.nextLine();
        return inStr;
    }

    private static Integer inInt;
    public static Integer askInt() {
        Scanner inPut = new Scanner (System.in);
        try {
             inInt = inPut.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Допустимі лише цілі числа. Повторіть ввід:");
            askInt();
        }
        return inInt;
    }

    private static Float inFloat;
    public static Float askFloat() {
        Scanner inPut = new Scanner (System.in);
        try {
            inFloat = inPut.nextFloat();
        }catch(InputMismatchException exc) {
            System.out.println("Допустимі лише числа, розділені комою, повторіть ввід");
            askFloat();
        }
        return inFloat;
    }

    private static Double inDouble;
    public static Double askDouble () {
        Scanner inPut = new Scanner (System.in);
        try {
            inDouble = inPut.nextDouble();
        }catch(InputMismatchException exc) {
            System.out.println("Допустимі лише числа, розділені комою, повторіть ввід");
            askDouble();
        }
        return inDouble;
    }

}
