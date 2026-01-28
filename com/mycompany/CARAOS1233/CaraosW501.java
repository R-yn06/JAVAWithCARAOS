package com.mycompany.caraos;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rcaraos
 */
import java.util.Scanner;
public class CaraosW501 {
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Please enter an integer");
         
         try{
             int Integer = sc.nextInt();
             int result = 100 / Integer ;
             System.out.printf("Result: %.2f\n" ,result);
         }
         catch (ArithmeticException e){
             System.out.println("You cannot Divide by 0");
         }
            System.out.println("The system is running well");
         
                 
    }

}
