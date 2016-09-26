package comm.walsh.exceptionexamples;
import javax.swing.*;
/** Example which crashes if user enters text instead of number
 *@author: Wu */
public class AgeInput1 {
  public static void main (String args[]){
        String inputStr
                 = JOptionPane.showInputDialog(null, "Enter age ");

        int age = Integer.parseInt(inputStr);

        System.out.println("Age is " + age);
    }

}