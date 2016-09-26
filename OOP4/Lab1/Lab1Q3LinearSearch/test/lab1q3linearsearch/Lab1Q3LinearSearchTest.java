/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q3linearsearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Helen
 */
public class Lab1Q3LinearSearchTest {
    
    public Lab1Q3LinearSearchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Lab1Q3LinearSearch.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Lab1Q3LinearSearch.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of search method, of class Lab1Q3LinearSearch.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String[] stringList = {"Bob", "Joy", "Ann", "Joe", "Una", "Roy"};
        
        //Search for middle element
        String searchString = "Ann";
        int expResult = 2;
        int result = Lab1Q3LinearSearch.search(stringList, searchString);
        assertEquals(expResult, result);
        
        //Search for first element
        searchString = "Bob";
        expResult = 0;
        result = Lab1Q3LinearSearch.search(stringList, searchString);
        assertEquals(expResult, result);
        
        //Search for last element
        searchString = "Roy";
        expResult = 5;
        result = Lab1Q3LinearSearch.search(stringList, searchString);
        assertEquals(expResult, result);
        
        //Search for omitted element
        searchString = "Helen";
        expResult = -1;
        result = Lab1Q3LinearSearch.search(stringList, searchString);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
