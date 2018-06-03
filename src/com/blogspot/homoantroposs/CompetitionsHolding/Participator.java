package com.blogspot.homoantroposs.CompetitionsHolding;

class Participator extends Person implements Comparable<Participator> {
 private String coach;
 private Integer age;
 private Float result;
 
 Participator (String name, String coach, Integer age){
   super (name);
   this.coach=coach;
   this.age=age;
 }
 String getCoach(){
   return coach;
 }
 
 void setCoach(String coach){
   this.coach = coach;
 }
 
 Integer getAge(){
   return age;
 }
 
 void setAge(Integer age){
   this.age=age;
 }
 
 Float getResult(){
   return result;
 }
 
 void setResult(Float result){
   this.result=result;
 }

 public int compareTo (Participator p){
   int compare;
   Float dif = this.getResult() - p.getResult();
   if (dif < 0)
   compare = 1;
   else if (dif > 0)
   compare = -1;
   else compare = 0;
   return compare;
  }
 public String toString(){
   return (String.format("%-15s %15s %2d %5.4f", getName(), getCoach(), getAge(), getResult()));
 }
}
