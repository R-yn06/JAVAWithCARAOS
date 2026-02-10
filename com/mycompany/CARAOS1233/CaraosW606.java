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
public class CaraosW606 {
    
    static Scanner sc = new Scanner(System.in);
        static int orig = 0;
        static int temp = 0;
        static int reversed = 0;  
    
    public static void main(String[] args){

        System.out.printf("What is the number?");
        orig = sc.nextInt();
        
        calculate();
        
    }
    
    
    public static void calculate(){
        do{
            temp = orig % 10;
            reversed = reversed * 10 + temp;
            orig = orig / 10;
            
        }while (orig != 0);
        
        System.out.printf("Reversed: %d", reversed);
    }
}
