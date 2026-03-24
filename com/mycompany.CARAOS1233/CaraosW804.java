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
public class CaraosW804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        boolean validInput = false;

        do {
            try {
                System.out.println("Enter three integers:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter only integers.");
                sc.next(); 
            }
        } while (!validInput); 

      
        int largest = largestOfThree(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
        
                
    public static int largestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
       
    }
}

   