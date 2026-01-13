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

public class CaraosW401 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int Number;
        
       
        System.out.print("Please input an Integer: ");
        Number = sc.nextInt();
    sc.close();
        if (Number % 2 == 0)
         System.out.print("Number is Even");
        else
         System.out.print("Number is Odd");
  
    }
}
