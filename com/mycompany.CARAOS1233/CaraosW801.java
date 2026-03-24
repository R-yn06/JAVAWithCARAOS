package com.mycompany.CARAOS1233;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rcaraos
 */
import java.util.Scanner;

public class CaraosW801 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for x: ");
        double x = input.nextDouble();

        System.out.print("Enter value for y: ");
        double y = input.nextDouble();

        computeResults(x, y);
    }

    public static void computeResults(double x, double y) {

        double absX = Math.abs(x);
        double maxValue = Math.max(x, y);
        double power = Math.pow(x, y);
        double sqrtX = Math.sqrt(Math.abs(x));
        long roundedY =  Math.round(y);
        printer(absX,maxValue,power,sqrtX,roundedY);
    }
    
    public static void printer(double abs,double max,double pow,double sqrt, long round){

        System.out.println("\nResults of Computation:");
        System.out.printf("""
                          Absolute value of x: %.2f
                          Maximum value: %.2f
                          x raised to y: %.2f
                          Square root of |x|: %.2f
                          Rounded value of y: %d
                          """, abs,max,pow,sqrt,round);
    }
}
