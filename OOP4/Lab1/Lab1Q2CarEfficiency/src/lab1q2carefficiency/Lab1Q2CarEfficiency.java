/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q2carefficiency;

/**
 * This class models a car. Its efficiency is measured in miles
 * per gallon in relation to the fuel in the tank.
 * @author Helen
 */
public class Lab1Q2CarEfficiency {
    private double fuelEfficiency;
    private double fuel;
    
    public Lab1Q2CarEfficiency() {
        fuelEfficiency = 0;
    }
    public Lab1Q2CarEfficiency(double fuelEff) {
        fuelEfficiency = fuelEff;
    }
    
    public double getFuel() {
        return fuel;
    }
    
    public void addFuel(double f) {
        fuel = f;
    }
    public void drive(double miles) {
        if (fuel <= miles/fuelEfficiency)
            System.out.println("Not enough fuel, you must add some!");
        else
            fuel = fuel - (miles/fuelEfficiency);
    }
}
