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
public class CaraosW404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Days;

        System.out.print("Please the number of the day:");
        Days = sc.nextInt();

        switch (Days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;    
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;    
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number choose only between 1-7 ");
        }

        sc.close();
    }
}
