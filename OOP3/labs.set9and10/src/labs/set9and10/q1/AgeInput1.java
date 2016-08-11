package labs.set9and10.q1;

import javax.swing.*;

/** Example which crashes if user enters text instead of number
 *@author: Wu */
public class AgeInput1 {
  public static void main (String args[]) {
        String inputStr = JOptionPane.showInputDialog(null, "Enter age ");

        int age = Integer.parseInt(inputStr);

        System.out.println("Age is " + age);
  }
}
/* Q1 a. A NumberFormatException was thrown.
 * 		 The methods that were running were:-
 * 		 java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 *		 java.lang.Integer.parseInt(Integer.java:580)
 *		 java.lang.Integer.parseInt(Integer.java:615)
 *		 labs.set9and10.q1and2.AgeInput1.main(AgeInput1.java:10)
 *
 * 	  b. The main difference between checked and unchecked exception is that 
 * 		 the checked exceptions are checked at compile-time 
 *		 the unchecked exceptions are checked at runtime.
 * 	  
 * 	  	 An unchecked exception was thrown in AgeInput1 
 * 
 * 		 java.lang
 * 		java.lang.Object
 *       java.lang.Throwable
 *           java.lang.Exception
 *               java.lang.RuntimeException
 *                   java.lang.IllegalArgumentException
 *                       java.lang.NumberFormatException 
 *                       
 *        Exception
 *                            
 */
