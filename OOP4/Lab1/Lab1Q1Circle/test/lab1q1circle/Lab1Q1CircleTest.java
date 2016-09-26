/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q1circle;

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
public class Lab1Q1CircleTest {
    
    public Lab1Q1CircleTest() {
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
     * Test of calcArea method, of class Lab1Q1Circle.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcArea");
        Lab1Q1Circle instance = new Lab1Q1Circle(10);
        double expResult = 314.15;
        double result = instance.calcArea();
        assertEquals(expResult, result, 0.2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcPerimeter method, of class Lab1Q1Circle.
     */
    @Test
    public void testCalcPerimeter() {
        System.out.println("calcPerimeter");
        Lab1Q1Circle instance = new Lab1Q1Circle(10);
        double expResult = 62.83;
        double result = instance.calcPerimeter();
        assertEquals(expResult, result, 0.2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRadius method, of class Lab1Q1Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double r = 0.0;
        Lab1Q1Circle instance = new Lab1Q1Circle();
        instance.setRadius(r);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lab1Q1Circle.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Lab1Q1Circle instance = new Lab1Q1Circle();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
