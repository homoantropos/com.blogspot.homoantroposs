package com.blogspot.homoantroposs.CompetitionsHolding;
import java.util.*;

class ByNameComparator implements Comparator<Participator> {
  
  public int compare(Participator p1, Participator p2){
    return p1.name.compareTo(p2.name);
  }
  
}
