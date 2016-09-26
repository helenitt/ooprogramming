/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q3linearsearch;

import java.util.Scanner;

/**
 * This program provides a method to search (Linear search) a list of strings 
 * for a particular string. The method returns the subscript in the array where 
 * searchString is found or -1 if it is not found.
 * @author Helen
 */
public class Lab1Q3LinearSearch {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"Bob", "Joy", "Ann", "Joe", "Una", "Roy"};
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search name: ");
        String searchName = input.nextLine();
        result = search(names, searchName);
        
        if(result > -1)
            System.out.println("Search name is at position " + (result+1));
        else
            System.out.println("Search name was not found");
    }
    
    public static int search(String[] stringList, String searchString) {
        //boolean ans = false;
        int answer = -1;
        //While loop better because you might not need to go through all elements 
        for(int i = 0; i<stringList.length; i++) {
            if(stringList[i].equals(searchString))
                answer = i;
        }
        return answer;
    } 
}
