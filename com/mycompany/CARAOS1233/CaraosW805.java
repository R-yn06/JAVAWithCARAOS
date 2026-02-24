/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *
 * @author rcaraos
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class CaraosW805 {
  
    public static void main(String[] args) {
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);
        double x1 =0,y1 =0,x2 =0,y2 =0;
        do {
            try {
        System.out.print("Enter points x1, y1: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.print("Enter points x2, y2: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        double w = rectWidth(x1, x2);
        double h = rectHeight(y1, y2);
        
        Printer(x1,x2,y1,y2,w,h);
         validInput = true; 

         } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter only Numbers.");
                sc.nextLine(); 
            }
        } while (!validInput); 
        sc.next(); 

    }
    
    
    public static void Printer(double x1,double x2,double y1,double y2,double w,double h){
        System.out.println("\n \n--Geometry Report--");
        System.out.printf("Point 1: (%.2f, %.2f)\n", x1, y1);
        System.out.printf("Point 2: (%.2f, %.2f)\n", x2, y2);
        System.out.printf("Distance: %.4f\n", distance(x1, y1, x2, y2));
        System.out.printf("Midpoint: (%.2f, %.2f)\n", midpointX(x1, x2), midpointY(y1, y2));
        
        if (isVertical(x1, x2)) {
            System.out.println("Slope: Undefined (Vertical)");
        } else {
            System.out.printf("Slope: %.4f\n", slope(x1, y1, x2, y2));
        }

        System.out.printf("Angle (degrees, 0-360): %.2f\n", angleDegrees(x1, y1, x2, y2));
        System.out.printf("Rectangle width: %.2f\n", w);
        System.out.printf("Rectangle height: %.2f\n", h);
        System.out.printf("Rectangle perimeter: %.2f\n", rectPerimeter(w, h));
        System.out.printf("Rectangle area: %.2f\n", rectArea(w, h));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double midpointX(double x1, double x2) {
        return (x1 + x2) / 2.0; 
    }

    public static double midpointY(double y1, double y2) {
        return (y1 + y2) / 2.0; 
    }

    public static boolean isVertical(double x1, double x2) {
        return x1 == x2; 
    }

    public static double slope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static double angleDegrees(double x1, double y1, double x2, double y2) {
        double angle = Math.toDegrees(Math.atan2(y2 - y1, x2 - x1));
        return (angle < 0) ? angle + 360 : angle;
    }

    public static double rectWidth(double x1, double x2) {
        return Math.abs(x2 - x1); 
    }

    public static double rectHeight(double y1, double y2) {
        return Math.abs(y2 - y1); 
    }

    public static double rectPerimeter(double width, double height) {
        return 2 * (width + height); 
    }

    public static double rectArea(double width, double height) {
        return width * height; 
    }
}
