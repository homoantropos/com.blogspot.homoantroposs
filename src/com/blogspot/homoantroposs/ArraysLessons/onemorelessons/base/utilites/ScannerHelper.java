package arrLessons.utilites;

import java.util.Scanner;

public class ScannerHelper {

    private static Scanner inPut = new Scanner (System.in);

    ScannerHelper () {}

    public static String inputStr () {
        String strIn = inPut.nextLine();
        return strIn;
    }

    public static Integer inputInt () {
        Integer intIn = Integer.parseInt(inPut.nextLine());
        return intIn;
    }
}
