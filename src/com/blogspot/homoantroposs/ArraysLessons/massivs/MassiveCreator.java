package com.blogspot.homoantroposs.ArraysLessons.massivs;

import com.blogspot.homoantroposs.Utilites.ScannerHelper;

import java.util.Arrays;

public class MassiveCreator {

    public static Integer [] createIntegerMass () {

        Integer lengthOfM = MassiveCreator.askLength();
        Integer start = MassiveCreator.askFirst();
        Integer step = MassiveCreator.askStep();

        Integer [] mass = Arrays.copyOf(MassiveCreator.getMassive(lengthOfM, start, step), MassiveCreator.getMassive(lengthOfM, start, step).length);

        return mass;
    }

    public static Integer [] getMassive (Integer lengthOfM, Integer start, Integer step) {

        Integer [] arrayInt = new Integer [lengthOfM];

        arrayInt[0] = start;

        for (int i=1; i<lengthOfM; i++) { arrayInt[i]= arrayInt[i-1]+step; }

        return arrayInt;

    }
    public static Integer [] getMassiveN () {
        System.out.println("Довжина массиву:");
        Integer lengthOfM = ScannerHelper.askInt();
        Integer [] arrayInt = new Integer [lengthOfM];
        for (int i = 0; i<lengthOfM; i++) {
            System.out.println("введіть значення");
            arrayInt[i] = ScannerHelper.askInt();
        }
        return arrayInt;
    }

    public static Integer askLength () {
        System.out.println("Укажіть довжину масиву:");
        Integer lengthOfM = ScannerHelper.askInt();
        return lengthOfM;
    }

    public static Integer askFirst () {
        System.out.println("Укажіть перше значення масиву:");
        Integer start = ScannerHelper.askInt();
        return start;
    }

    public static Integer askStep () {
        System.out.println("Укажіть крок значень масиву:");
        Integer step = ScannerHelper.askInt();
        return step;
    }
}
