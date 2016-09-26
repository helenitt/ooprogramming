/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q5arraysbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Helen
 */
public class Lab1Q5ArraysBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = 0;
        //Create unsorted array of type string
        String[] names = {"Bob", "Joy", "Ann", "Joe", "Una", "Roy"};
        
        //sort array
        Arrays.sort(names);
        
        //print out the unsorted array
        System.out.println("The sorted array is: ");
        
        for(String n: names) {
            System.out.println(n);
        }
        
        //enter name to be serached
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name to be searched");
        String searchName = input.nextLine();
        
        result = Arrays.binarySearch(names, searchName);
        
        //print out result
        if(result < 0) 
            System.out.println("Name not found");
        else
            System.out.println("The name was found at index " + result);
    }
    
}
