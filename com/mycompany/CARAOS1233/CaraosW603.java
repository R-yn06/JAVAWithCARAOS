/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 * W603: ATM Menu with Lockout

Goal: Use a boolean flag to control the loop.

Problem:
Simulate a simple ATM with a starting balance of ₱5000.

Display a repeating menu:

Check balance
Deposit
Withdraw
Exit
Rules:

Withdraw cannot exceed balance (reject if it does)
Deposit and withdraw must be > 0
If the user makes 3 invalid transactions in a row, the system locks and exits automatically.
Use a flag-controlled while loop to keep the menu running. 


 * @author rcaraos
 */

import java.util.Scanner;

public class CaraosW603 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        int invalidCount = 0;
        boolean continueLoop = true;
        int SetPassword = 1234567890;
        int Password = 0;
        
         System.out.printf("Please Enter Password:");
            Password = sc.nextInt();
            if (Password == SetPassword){
                
        while (continueLoop) {
            
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: $%,.2f\n", balance);
                    invalidCount = 0;
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposited %,.2f%n", deposit);
                        invalidCount = 0;
                    } else {
                        System.out.println("Invalid deposit amount.");
                        invalidCount++;
                    }   break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrew $%,.2f\n", withdraw);
                        invalidCount = 0;
                    } else {
                        System.out.println("Invalid withdrawal.");
                        invalidCount++;
                    }   break;
                case 4:
                    System.out.println("Thank you for Trusting Ryan's ATM.");
                    continueLoop = false;   
                    break;
                default:
                    System.out.println("Invalid option. Choose from 1-4");
                    invalidCount++;
                    break;
            }

            if (invalidCount == 3) {
                System.out.println("\nSYSTEM LOCKED: Too many invalid transactions.");
                continueLoop = false;  
            }
            }
            }
            else{
                 System.out.printf("Invalid Password\n");
            }
            
        System.out.println("Program terminated.");
        sc.close();
    }
        }
    

    

