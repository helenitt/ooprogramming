/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

/**
 *
 * @author Helen
 */
public class MyArrayList {

    public static void main(String[] args) {
        List<String> listArray = new ArrayList<>();
        List<String> listLink = new LinkedList<>();

        try {   // The name of the file which we will read from
            String filename = "words.txt";

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine()) {
                // Read one line from the file
                String line = in.nextLine();
                listArray.add(line);
                listLink.add(line);
                    //testGetForList(listArray);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }

        //System.out.println(listArray);
        //System.out.println(listLink);
        
        //TEST GET
        long startTime = System.currentTimeMillis();
        testGetForArrayList(listArray);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        
        System.out.println("The for ArrayList get: " + timeTaken);
        
        startTime = System.currentTimeMillis();
        testGetForLinkedList(listLink);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Linked List get: " + timeTaken);
        
        //TEST ITERATE
        startTime = System.currentTimeMillis();
        testIterateForArrayList(listArray);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Array List iterate: " + timeTaken);
        
        startTime = System.currentTimeMillis();
        testIterateForLinkedList(listLink);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Linked List iterate: " + timeTaken);
        
        //TEST INSERT
        startTime = System.currentTimeMillis();
        testInsertForArrayList(listArray);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Array List insert: " + timeTaken);
        
        startTime = System.currentTimeMillis();
        testInsertForLinkedList(listLink);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Linked List insert: " + timeTaken);
        
        //TEST REMOVE
        startTime = System.currentTimeMillis();
        testRemoveForArrayList(listArray);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Array List remove: " + timeTaken);
        
        startTime = System.currentTimeMillis();
        testRemoveForLinkedList(listLink);
        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        
        System.out.println("The for Linked List remove: " + timeTaken);
    }

    public static void testGetForList(List list) {
        int reps = 10000;
        int quantity = reps / 10;
        for (int i = 0; i < reps; i++) {
        // reps is the number of repetitions
            // declare reps as something large e.g. 10000
            for (int j = 0; j < quantity; j++) // declare quantity  						// as reps/10
            {
                list.get(j); // list is your list 
            }			        // (ArrayList or LinkedList)

        }
    }
    
    public static void testIterateForList(List list) {
        int reps = 10000;
        for (int i = 0; i < reps; i++) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
    
    
    public static void testInsertForList(List list) {
        int reps = 10000;
        int half = list.size() / 2;
        String s = "test";
        ListIterator it = list.listIterator(half);
        for (int i = 0; i < reps * 10; i++) {
            it.add(s);
        }
    }
    
    public static void testRemoveForList(List list) {

        ListIterator it = list.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
}

    private static void testGetForArrayList(List<String> list) {
        testGetForList(list);
    }

    private static void testGetForLinkedList(List<String> list) {
        testGetForList(list);
    }

    private static void testIterateForArrayList(List<String> listArray) {
       testIterateForList(listArray);
    }

    private static void testIterateForLinkedList(List<String> listLink) {
        testIterateForList(listLink);
    }

    private static void testInsertForArrayList(List<String> listArray) {
        testInsertForList(listArray);
    }

    private static void testInsertForLinkedList(List<String> listLink) {
        testInsertForList(listLink);
    }

    private static void testRemoveForArrayList(List<String> listArray) {
        testRemoveForList(listArray);
    }

    private static void testRemoveForLinkedList(List<String> listLink) {
        testRemoveForList(listLink);
    }

}