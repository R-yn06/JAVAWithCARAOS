/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *
 * @author rcaraos
 */
public class CaraosW902 {

    static int totalContributions = 0;
    static double totalSavings = 0.0;

    final static double UNIVERSITY_BONUS = 50.00;
    final static String UNIVERSITY_NAME = "International State College of the Phillipines";

  
    static void addContribution(double amount) {
        totalContributions++;
        totalSavings += amount + UNIVERSITY_BONUS;
    }

    static double computeFinalAmount(double amount) {
        amount += UNIVERSITY_BONUS;
        return amount;
    }

    final static void printSummary() {
        System.out.println("\n===== SUMMARY =====");
        System.out.println("University: " + UNIVERSITY_NAME);
        System.out.println("Total Contributors: " + totalContributions);
        System.out.printf("Total Savings: %.2f\n", totalSavings);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Ateneo Savings Program\n");
       
        int Contri = 3;
        
        for(int i=1; Contri >= i;i++){
        addContribution(500.00);
        }
        
        double finalAmount = computeFinalAmount(500.00);
        System.out.printf("Contribution with bonus: %.2f\n", finalAmount);

        printSummary();
    }
}