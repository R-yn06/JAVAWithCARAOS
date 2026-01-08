/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *
 * @author rcaraos
 */
public class CaraosW101 {
       public static void main(String[] args) {
      
        //Constant
        final int My_DAYS_WEEK = 7;
        final double PI = 3.14;
        final double AVOCADO_NUMBER = 6.022;
        
        //Variable
        
        int a = 20;
        int b = 5;
        double radius = 5.5;
        
        //Arithmetic
        
        int sum = a+b;
        int differ = a-b;
        int product = a*b;
        double quotient = (double) a/b;        //Casting
        int rem = a%b;
        
        double circleArea = PI * radius * radius;
        double circleCircum = 2* PI * radius;
      
        // Output Result
           
        System.out.println("Arithmetic Results:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum:" + sum);
        System.out.println("Differemce:"+ differ);
        System.out.println("Product:" + product);
        System.out.println("Remainder:" + rem);
        System.out.println("Circle Computation:");
        System.out.println("Circle Area:" + circleArea);
        System.out.println("Circle Circumference:" + circleCircum);
        System.out.println("Constants:");
        System.out.println("The Days of the Week are:" + My_DAYS_WEEK);
        System.out.println("The Value of Pi:" +PI);
        System.out.println("Avogardro's Number: " +AVOCADO_NUMBER);
       
           
  
    }
}
