/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rcaraos
 */
public class CaraosW502 {
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner(System.in);
         
         
         try{
             System.out.println("Please enter 2 integers to divide");
             int x; 
             int y;
                x = sc.nextInt();
                y = sc.nextInt();
             double quotient = x / y ;
             System.out.printf("Result: %.2f\n" ,quotient);
         }
         catch (ArithmeticException e){
             System.out.println("You cannot Divide by 0");
         }
         catch (InputMismatchException e){
             System.out.println("You cannot Divide by non-numeric Value");
         }
            System.out.println("The system is running well");
         
                 
    }
}
