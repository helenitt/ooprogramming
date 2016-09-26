/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q1circle;

/**
 * This class models a circle. 
 * @author Helen
 */
public class Lab1Q1Circle {
    private double radius;
    
    public Lab1Q1Circle() {
        radius = 0;
    }
    public Lab1Q1Circle(double r) {
        radius = r;
    }
    
    public double calcArea() {
        return Math.PI * (radius * radius);
    }
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    
    @Override
    public String toString() {
        return "With a radius of " + radius + 
                " the area of the circle will be: " + calcArea() +
                "\n and the perimeter will be: " + calcPerimeter();
    }
}
