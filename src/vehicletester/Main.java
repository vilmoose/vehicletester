/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    int passengers;
    double fareCost, fuelCost;
    String input1 = (JOptionPane.showInputDialog("Enter the number of passengers"));
    String input2 = JOptionPane.showInputDialog("Enter the cost of the fare per person");
    String input3 = JOptionPane.showInputDialog("Enter the cost of fuel per liter");
    
    passengers = Integer.parseInt(input1);
    fareCost = Double.parseDouble(input2);
    fuelCost = Double.parseDouble(input3);
    
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0, passengers, fareCost, fuelCost);
    //Show Vehicle Info
    double rev = fareCost * passengers;
    
     
  
    System.out.println(car1);

    //Drive car for 100km
    car1.driveVehicle(100.0);
    System.out.println(car1);

    //Drive car for 450 kms
    car1.driveVehicle(450.0);
    System.out.println(car1);

    //Try to drive 1000 km - runs out of gas
    car1.driveVehicle(1000.0);
    System.out.println(car1);

    //Add 25L of gas
    car1.addFuel(25.0);
    System.out.println(car1);

    //Try to add 100 L of gas
    car1.addFuel(100.0);
    System.out.println(car1);
    
    System.out.println("Revenue: " + rev);
    System.out.println();
  }
}