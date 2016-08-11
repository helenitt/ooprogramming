//HouseDriver.java

import java.util.Scanner;

public class HouseDriver {
	public static void main(String[] args) {
		System.out.println("Will first try to create a House object via the " +
						   "the no-argument copy constructor...");
		House h1 = new House();
		System.out.println("The values of the House object h1 are as follows:\n\n" + 
							h1.toString());
							
		System.out.println("\nWill now try to create a second House object h2" +
						   "via arguments passed to the constructor with " +
						   "invalid price\n");
		House h2 = new House("Anywhere","Bungalow",0.0,"Marilyn", 35, 'F');
		System.out.println("The values of the House object h2 are now: " +
						    h2.toString());
		
		System.out.println("\nThe values of the  House object h2 at " +
						   "this stage with valid price\n");
		h2.setPrice(300000.00);
		System.out.println("The values of the House object h2 are now: " +
						    h2.toString());				    				   
	}
}