/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q1circle;

import javax.swing.*;

/**
 * This program will calculate the area and perimeter. 
 * @author Helen
 */
public class CircleApp {
    public static void main(String[] args) {
        double radius;
        
        radius = Double.parseDouble(JOptionPane.showInputDialog("Ener radius:"));
        
        Lab1Q1Circle circle = new Lab1Q1Circle(radius);
        
        double area = circle.calcArea();
        double perimeter = circle.calcPerimeter();
        
        JOptionPane.showMessageDialog(null, "Area: "+area+"\nPerimeter: "+perimeter);
    }
}
