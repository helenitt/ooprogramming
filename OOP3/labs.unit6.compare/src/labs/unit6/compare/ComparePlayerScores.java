package labs.unit6.compare;

import java .util.*;
public class ComparePlayerScores implements Comparator<Player> {
   public int compare(Player p1, Player p2){
   	  if (p1.getScore() > p2.getScore())
   	    return +1;
   	  else if (p1.getScore() == p2.getScore())
   	  	return 0;
   	  else
   	  	return -1;
   }


 }
