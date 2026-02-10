/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *
 *
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaraosW302 {
    public static void main(String[] args) 
                throws FileNotFoundException{ 
        Scanner inFile = new Scanner  (new FileReader("C:\\Users\\rcaraos\\Desktop\\input.txt"));
        String Name;
        double Grade;
        
        Name = inFile.nextLine();
        Grade = inFile.nextDouble();
        
        
        JOptionPane.showMessageDialog(null,String.format("""
                                                         Student Name: %s
                                                         Grade: %.2f
                                                         """,Name,Grade));
        inFile.close();
 
    }
            
}

 * @author rcaraos
 */

import java.io.FileReader;                                          
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaraosW607 {
    public static void main(String[] args) {
        String fileName = "accountData.txt";
        
        String accountNumber = "";
        double beginningBalance = 0.0;
        double currentBalance = 0.0;
        double totalInterest = 0.0;
        double totalDeposited = 0.0;
        double totalWithdrawn = 0.0;
        int countDeposits = 0;
        int countWithdrawals = 0;

        try {
            Scanner inFile = new Scanner  (new FileReader("C:\\Users\\rcaraos\\Desktop\\accountData.txt"));

        
            if (inFile.hasNext()) {
                accountNumber = inFile.next();
            }
            if (inFile.hasNextDouble()) {
                beginningBalance = inFile.nextDouble();
                currentBalance = beginningBalance;
            }

         
            while (inFile.hasNext()) {
                String type = inFile.next().toUpperCase();
                
         
                if (inFile.hasNextDouble()) {
                    double amount = inFile.nextDouble();

                    switch (type) {
                        case "D": 
                            currentBalance += amount;
                            totalDeposited += amount;
                            countDeposits++;
                            break;
                        case "W":
                            currentBalance -= amount;
                            totalWithdrawn += amount;
                            countWithdrawals++;
                            break;
                        case "I": 
                            currentBalance += amount;
                            totalInterest += amount;
                            break;
                    }
                }
            }
            inFile.close();

            // Display Summary Report
            printReport(accountNumber, beginningBalance, currentBalance, 
                        totalInterest, totalDeposited, countDeposits, 
                        totalWithdrawn, countWithdrawals);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }
    }

    public static void printReport(String accNum, double begBal, double endBal, 
                                   double interest, double depAmt, int depCount, 
                                   double witAmt, int witCount) {
        System.out.println("========================================");
        System.out.println("        MONTHLY ACCOUNT SUMMARY         ");
        System.out.println("========================================");
        System.out.printf("Account Number:     %s%n", accNum);
        System.out.printf("Beginning Balance:  $%,.2f%n", begBal);
        System.out.printf("Ending Balance:     $%,.2f%n", endBal);
        System.out.println("----------------------------------------");
        System.out.printf("Total Interest:     $%,.2f%n", interest);
        System.out.printf("Total Deposited:    $%,.2f (%d deposits)%n", depAmt, depCount);
        System.out.printf("Total Withdrawn:    $%,.2f (%d withdrawals)%n", witAmt, witCount);
        System.out.println("========================================");
    }
}

