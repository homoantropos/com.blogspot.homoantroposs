package com.blogspot.homoantroposs.CompetitionsHolding;

class MainJude extends Judge {
  
 MainJude (String name, String category){
   super (name, category);
 }
 
  static JudgeOfFTK registerTheJudge(){
    System.out.println("Для реєстрації судді ведіть ім'я:");
    String name = ScannerHelper.inputStr();
    System.out.println("Введіть категорію:");
    String category = ScannerHelper.inputStr();
    JudgeOfFTK judge = new JudgeOfFTK(name, category);
    return judge;
  }
  
  static JudgeOfFTK[] creatorPainOfJ(){
     System.out.println("Призначте суддівську колегію:");
    JudgeOfFTK[] panOfJg = new JudgeOfFTK[4];
    for (int i=0; i<4;i++)
    panOfJg[i]=MainJude.registerTheJudge();
    return panOfJg;
   }
   
}
