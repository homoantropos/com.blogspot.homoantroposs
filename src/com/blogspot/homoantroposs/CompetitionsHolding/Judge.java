package com.blogspot.homoantroposs.CompetitionsHolding;

class Judge extends Person {
  private String category;
  Judge (String name, String category){
   super (name);
   this.category=category; 
  }
  
  String getCategory(){
    return category;
  }
  
  void setCategory(String category){
    this.category=category;
  }
  
  public String toString(){
    return String.format("%20s %15s", getName(), getCategory());
  }
}
