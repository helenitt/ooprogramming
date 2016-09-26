/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q5binarysearch;

import java.util.*;

/**
 *
 * @author Helen
 */
public class Lab1Q5BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create unsorted array of type string
        String[] names = {"Ann", "Bob", "Joe", "Joy", "Roy", "Una"};
        
        //print out the array
        System.out.println("The sorted array is: ");
        
        for(String n: names) {
            System.out.println(n);
        }
        
        //enter name to be serached
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search name: ");
        String searchName = input.nextLine();
        
        int result = binarySearch(names, searchName);
        
        if(result == -1)
            System.out.println("Name not found!");
        else
            System.out.println("Name found at index " + result);
    }
    public static int binarySearch(String[] names, String sName) {
        int low = 0;
        int high = names.length -1;
        int middle;
        
        while(low <= high) {
            middle = (low + high)/2;
            
            if(sName.equals(names[middle]))
                return middle; // name found
            else if (sName.charAt(0) < names[middle].charAt(0))
                high = middle - 1; // search low end of array
            else
                low = middle + 1; // search high end of array
        }
        return -1; // search name not found
    }
}
