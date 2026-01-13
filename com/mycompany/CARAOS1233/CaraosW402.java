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

public class CaraosW402 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int Grade;
        
      
       System.out.print("Please input your Grade: ");
        Grade = sc.nextInt();
    sc.close();
    
        if (Grade >= 90)
         System.out.print("Grade: A");
        else if (Grade >= 80)
         System.out.print("Grade: B");
        else if (Grade >=70)
         System.out.print("Grade: C");
        else if (Grade >= 60)
         System.out.print("Grade: D");
        else 
         System.out.print("Grade: F");
  
    }
}
