//Set1Ex6MethodsCube.java
/*This program has a user-defined method which is passed an integer 
 *value and returns the cube of it.
 *User-written methods.*/

public class Set1Ex6MethodsCube {
	public static void main(String[] args) {
			
		System.out.println(String.format("%-12s%s","Number","Cube"));
		
		for(int i=1;i<=15;i++){
			System.out.println(String.format("%-12s%s",i,cube(i)));
		}
	}
	public static int cube(int c){
		return c*c*c;
	}
}