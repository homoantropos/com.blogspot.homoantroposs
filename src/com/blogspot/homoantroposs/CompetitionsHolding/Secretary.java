package com.blogspot.homoantroposs.CompetitionsHolding;

import java.util.*;

class Secretary extends Judge {
  
  Secretary (String name, String category){
    super (name, category);
  }
  
 static Participator registerTheParticipator(){
    System.out.println("Для реєстрації учасника введіть ім'я:");
    String name = ScannerHelper.inputStr();
    System.out.println("Введіть ім'я тренера:");
    String coach = ScannerHelper.inputStr();
    System.out.println("вік:");
    Integer age=ScannerHelper.inputInt();
    Participator participator = new Participator (name, coach, age);
    return participator;
  }
  
   
   static ArrayList<Participator> createLOP(){
    System.out.println("Створити склад учасників?");
    ArrayList<Participator> prtcptrs=new ArrayList<Participator>();
    Participator prtsptr;
    String choice = ScannerHelper.inputStr();
   switch (choice) {
    case "+" : {
    while(choice.equals("+")){
    prtsptr = Secretary.registerTheParticipator();
    prtcptrs.add(prtsptr);
    System.out.println("Продовжити? виберіть +/-");
    choice = ScannerHelper.inputStr();
    switch (choice) {
      case "-" : {
      break;
      }
      default : continue;
    }
    }
    }
    case "-" : break;
    default : break;
    }
    return prtcptrs;
   }
}
