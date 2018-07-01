package com.blogspot.homoantroposs;

import com.blogspot.homoantroposs.Utilites.ScannerHelper;

public final class TimeMesure {

    private static int min = 0;
    private static int sec = 0;

    TimeMesure () {}

    public static void go() {

        System.out.println("Start?");
        String start = ScannerHelper.askStr();

        if (start.equals("+")) {
            while (start.equals("+")) {
                countMin();
            }
        } else {
            System.out.println("Зробіть свій вибір");
            go();
        }
    }

        public static void countMin () {
              try {
                    if (sec == 60) {
                        min = min + 1;
                        sec = 0;
                    }
                    if (min < 10) {
                        if (sec < 10) {
                            System.out.println(String.format("0%1d:0%1d", min, sec));
                        } else {
                            System.out.println(String.format("0%1d:%2d", min, sec));
                        }
                    } else {
                        if (sec < 10) {
                            System.out.println(String.format("%2d:0%1d", min, sec));
                        } else {
                            System.out.println(String.format("%2d:%2d", min, sec));
                        }
                    }
                  sec = sec + 1;
                  Thread.sleep(1000);
                } catch (InterruptedException intEx) {
                }
        }
}
