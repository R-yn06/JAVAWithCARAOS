package com.mycompany.caraos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Objective
Create a class that computes the area and perimeter of a rectangle.

Instructions
Write a Java program that defines a class called Rectangle.

The class must contain the following data members:

length
width

The class must contain the following methods:

setDimensions()
computeArea()
computePerimeter()
displayResult()

Program Requirements
setDimensions() should accept the rectangle's length and width from the main program.

computeArea() should calculate: area = length × width

computePerimeter() should calculate: perimeter = 2 × (length + width)
displayResult() should display the length, width, area, and perimeter.

In the main method:

Ask the user to input length and width.

Create a Rectangle object.

Call the methods to compute and display the results.

Example Output:

Enter Length: 5
Enter Width: 3

Rectangle Results
-----------------
Length: 5
Width: 3
Area: 15
Perimeter: 16
 * @author rcaraos
 */
import java.util.Scanner;
public class CaraosW1102 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Length of the Rectangle:");
        double length = sc.nextDouble();

        System.out.println("Enter the Width of the Rectangle:");
        double width = sc.nextDouble();

        Rectangle rectangleClass = new Rectangle();

        rectangleClass.
    }
}

class Rectangle{
    private double length;
    private double width;


    public void setDimension(double l, double w){
        this.length = l
        this.width = w;
    }
    public double computeArea(){
       return length * width;
    }
    public double computePerimeter (){
        return 2*(length + width);
    }
    public void  displayResults(){
        System.out.printf("""
                          Rectangle Results
                          -----------------
                          Length:       %.2f
                          Width:       %.2f
                          Area:        %.2f
                          Perimeter:        %.2f
                          """,
                length,width,computeArea(),computePerimeter);
    }

}
