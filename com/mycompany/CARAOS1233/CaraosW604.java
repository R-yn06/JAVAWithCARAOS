<<<<<<< HEAD
package com.mycompany.CARAOS1233;

import java.util.Scanner;
public class CaraosW604 {
    public static void main (String[] args){
        int n = 0;
        int odd = 0;
        int even = 0;
        int zeros = 0;
        Scanner sc = new Scanner (System.in);

        System.out.println("How many integers to input:");
        n = sc.nextInt();
        for (int i = 0; n >= i; i++){
            System.out.println ("Input an integer");
            int num = sc.nextInt();

            if (num == 0){
                zeros++;
            }
            else if (num % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            }
            sc.close();
            
        System.out.println("Number of odd integers: " + odd);
        System.out.println("Number of even integers: " + even);
        System.out.println("Number of zeros: " + zeros);
        }
        
    }

=======
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
public class CaraosW604 {
    public static void main (String[] args){
        int n = 0;
        int odd = 0;
        int even = 0;
        int zeros = 0;
        Scanner sc = new Scanner (System.in);

        System.out.println("How many integers to input:");
        n = sc.nextInt();
        
        
        for (int i = 0; n > i; i++){
            System.out.println ("Input an integer");
            int num = sc.nextInt();

            if (num == 0){
                zeros++;
            }
            else if (num % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            }
            sc.close();
            
        System.out.println("Number of odd integers: " + odd);
        System.out.println("Number of even integers: " + even);
        System.out.println("Number of zeros: " + zeros);
        }
        
    }
>>>>>>> 1facf52651e88109db1fea9d803c962bbbf2e651
