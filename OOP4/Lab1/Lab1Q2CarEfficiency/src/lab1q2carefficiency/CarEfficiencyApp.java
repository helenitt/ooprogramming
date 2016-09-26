/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q2carefficiency;

/**
 *
 * @author Helen
 */
public class CarEfficiencyApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Lab1Q2CarEfficiency myCar = new Lab1Q2CarEfficiency(30);
        myCar.addFuel(20);
        myCar.drive(90);
        System.out.println("Fuel now: " + myCar.getFuel()); 
    }
}
