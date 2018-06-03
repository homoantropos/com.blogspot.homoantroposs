package com.blogspot.homoantroposs.CompetitionsHolding;
import java.util.Scanner;

class ScannerHelper {
  static Scanner inPut = new Scanner(System.in);
  ScannerHelper(){}
  static String inputStr (){
    String strInput = inPut.nextLine();
    return strInput;
  }
  static Integer inputInt(){
    Integer intInput = Integer.parseInt(inPut.nextLine());
    return intInput;
  }
  
}
