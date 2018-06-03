package com.blogspot.homoantroposs.CompetitionsHolding;

public class TaoPerformence extends SingleActOfCompetitions {
 
 Participator participator;
 JudgeOfFTK judge1;
 JudgeOfFTK judge2;
 JudgeOfFTK judge3;
 JudgeOfFTK judge4;
 Float result;
 String nameOfCompetitions;
 
 void go (Participator participator, JudgeOfFTK [] judges) {
 
  Float decicions = 0.0f;
  for (JudgeOfFTK j : judges){
  decicions = decicions + j.makeDecicion();}
  Float result = ResultsCunter.countResult(decicions);
  participator.setResult(result);
  System.out.println(participator.toString());
}
}
