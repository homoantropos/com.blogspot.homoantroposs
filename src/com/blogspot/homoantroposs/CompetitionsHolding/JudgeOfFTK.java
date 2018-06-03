package com.blogspot.homoantroposs.CompetitionsHolding;

class JudgeOfFTK extends Judge implements JudgesDecicion{
  
  JudgeOfFTK (String name, String category){
   super (name, category); 
  }
  
  public Float makeDecicion (){
    Float decicion=0.0f;
    System.out.println("оцінку від 0 до 99:");
    int decInt=ScannerHelper.inputInt();
    if (decInt >0){
      if (decInt<=99){
    decicion = decInt/10f;
    System.out.println(decicion);}
    else makeDecicion();
    }
    else {makeDecicion();}
    return decicion;
  }
 
}
