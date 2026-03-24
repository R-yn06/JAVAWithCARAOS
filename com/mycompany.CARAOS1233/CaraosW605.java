<<<<<<< HEAD
package com.mycompany.CARAOS1233;

import java.util.Scanner;
public class CaraosW605 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
     
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

import java.util.Scanner;

/**
 *
 * @author rcaraos
 */
public class CaraosW605 {
    public static void main (String[] args){
     int start = 0;
     int end = 0;
     int divisor = 0;
    
     int counter = 0;
    
     Scanner sc = new Scanner(System.in);
    
   
     System.out.println("Input starting Number:");
        start = sc.nextInt();
        
        System.out.println("Input ending Number:");
        end = sc.nextInt();
        
        System.out.println("input the divisor:");
        divisor = sc.nextInt();
    
        int i; 
        for (i = start; i <= end; i++){
            if (i % divisor == 0){
                counter++;
            }
        }
 
        System.out.printf("Numbers divisable: %d", counter);
    }
}
>>>>>>> 1facf52651e88109db1fea9d803c962bbbf2e651
