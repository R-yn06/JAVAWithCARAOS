/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *
 * @author rcaraos
 */

import java.util.Scanner;
public class CaraosW403 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int Age;
        int income;
        
      
       System.out.print("Please input your Age: ");
        Age = sc.nextInt();
        if (Age >= 21)
            System.out.println("User is Eligable for Loan: ");
            System.out.print("Please input your income: ");
            income = sc.nextInt();
                if (income >= 30000)
                  System.out.println("Approved ");
                else
                  System.out.println("Approved ");
        else 
            System.out.println("User is NOT Eligable for Loan: ");
            
    sc.close();
    
    
    }
}
