/**
 * @(#)RandomNumberGen.java
 *
 *
 * @author 
 * @version 1.00 2015/11/11
 */

import java.util.Random;
public class RandomNumberGen {

    public static void main(String [] args){
    	
    	Random rand = new Random();
    	//argument specifies the range upperbound
    	int randomnum= rand.nextInt(500);
    	    	
    	System.out.println("random num " +randomnum);
    	
    	// between 50 and 100
    	randomnum= 50 + rand.nextInt(50);
    	System.out.println("random num in range " +randomnum);
    	
    }
    
    
}