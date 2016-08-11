//LinearSearch.java
/*This program will use 2 related (parallel) arrays. One of these will store 
 *the stock ID numbers for products in a shop and the other the corresponding 
 *price of that product. The arrays will be populated and then the user asked 
 *to enter a particular stock ID number. A linearSearch() method then searches 
 *the stock ID array and if the product exists, the corresponding product price 
 *is displayed*/
 
 import java.util.Scanner;
 
 public class LinearSearch {
 	public static void main(String args[])
	 	{
	 		int stockIDs[] = new int[5], searchID, subscript;
	 		float prices[] = new float[5];
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		readArray(stockIDs,prices);
	 		
	 		System.out.print("\n\nEnter the product ID number you want the price for: ");
	 		searchID = input.nextInt();
	 		
	 		subscript = linearSearch(stockIDs,searchID);
	 		
	 		if(subscript != -1)
	 			System.out.println("The product ID number " + searchID + " has been found and " +
	 							   " its price is €" + prices[subscript]);
	 		else
	 			System.out.println("Sorry - the product ID number you seek " + searchID +
	 							   " has not been found");
	 	}
	 public static void readArray(int idno[], float prices[])
		 {
		 	Scanner input = new Scanner(System.in);
		 	
		 	System.out.println("Please enter the product ID number and prices for " +
		 	idno.length + " stock items\n");
		 	
		 	for(int i=0; i<idno.length; i++)
			 	{
			 		System.out.print("\nPlease enter the ID number for product " + (i+1) + ": ");
			 		idno[i] = input.nextInt();
			 		System.out.print("Please enter the price for this product: ");
			 		prices[i] = input.nextFloat();
			 	}
		 }
	public static int linearSearch(int idno[], int key)
		{
			for(int i=0; i<idno.length; i++)
				if(idno[i]==key)
					return i;
					
			return -1;	
		}
 }