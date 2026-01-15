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
public class CaraosW405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float Num1;
        float Num2;
        char Operator;
        
        System.out.print("Please input First Number:");
        Num1 = sc.nextInt();
        
        System.out.print("Please input the Operator:");
        Operator = sc.next().charAt(0);
        System.out.print("Please input Second Number:");
        Num2 = sc.nextInt();
        
        

        switch (Operator){
            case '+':
                float sum = Num1 + Num2;
                System.out.printf("%.2f + %.2f = %.2f", Num1, Num2,sum);
                break;
            case '-':
                System.out.printf("%.2f + %.2f = %.2f", Num1, Num2, Num1 - Num2);
                break;    
            case '*':
                System.out.printf("%.2f + %.2f = %.2f", Num1, Num2, Num1 * Num2);
                break;
            case '/':
                System.out.printf("%.2f + %.2f = %.2f", Num1, Num2, Num1 / Num2);
                break;
            case '%':
                System.out.printf("%.2f + %.2f = %.2f", Num1, Num2, Num1 % Num2);
                break;    
            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
