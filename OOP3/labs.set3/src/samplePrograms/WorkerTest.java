package samplePrograms;

import javax.swing.*;
/** Driver class to test out the Employee, Manager and HourlyWorker classes*/
public class WorkerTest{
   public static void main(String args[]) {
       Employee emp; //an object of type Employee or any subclass
       Manager m1 = new Manager("Mary","Smith",750.50);
       HourlyWorker hw1 = new HourlyWorker("Joe","O'Neill", 8.5,100);
       
       //Employee employee = new Employee("Joe", "Soap");
       
       emp=m1; //a Manager "is a" Employee so this assignment is allowed   
       //use the Employee reference object to display the correct information 
       JOptionPane.showMessageDialog(null,String.format("%s: earnings were $%.2f\n",
       emp.toString(),emp.earnings()));         
       
       emp=hw1; //an HourlyWorker "is a" Employee so this is okay too  
       //display the details again
       //note the generic nature of the code here: polymorphism is at work
       JOptionPane.showMessageDialog(null,String.format("\n%s: earnings were €%.2f\n\n",
       emp.toString(),emp.earnings()));
        
   }
}