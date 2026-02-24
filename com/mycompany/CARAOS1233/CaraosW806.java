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
public class CaraosW806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter annual interest rate (percent): ");
        double annualRate = sc.nextDouble();
        System.out.print("Enter term (years): ");
        int years = sc.nextInt();

        double r = monthlyRate(annualRate);
        int n = numberOfPayments(years);
        double exactM = monthlyPayment(p, r, n);
        double exactTotal = totalPayment(exactM, n);
        double exactInterest = totalInterest(exactTotal, p);

        double roundedM = roundUpToCent(exactM);
        double roundedTotal = totalPayment(roundedM, n);
        double roundedInterest = totalInterest(roundedTotal, p);
        
        Printer(p, annualRate, years, r, n, exactM, exactTotal, exactInterest, roundedM, roundedTotal, roundedInterest);
        sc.close();
    }
    
    public static void Printer(double p, double annualRate, int years, double r, int n, double exactM, double exactTotal, double exactInterest, double roundedM, double roundedTotal, double roundedInterest){
        System.out.println("\n--- Loan Payment Report ---");
        System.out.printf("Principal: %.2f\n", p);
        System.out.printf("Annual Rate: %.4f%%\n", annualRate);
        System.out.printf("Monthly Rate: %.6f\n", r);
        System.out.println("Number of Payments No: " + n);

        System.out.println("\n--- Exact (Unrounded) ---");
        System.out.println("Monthly Payment: " + exactM);
        System.out.printf("Total Payment: %.2f\n", exactTotal);
        System.out.printf("Total Interest: %.2f\n", exactInterest);

        System.out.println("\n--- Rounded UP to Centavo ---");
        System.out.printf("Monthly Payment (rounded up): %.2f\n", roundedM);
        System.out.printf("Total Payment (rounded): %.2f\n", roundedTotal);
        System.out.printf("Total Interest (rounded): %.2f\n", roundedInterest);
    }

    public static double monthlyRate(double annualRatePercent) {
        return (annualRatePercent / 100.0) / 12.0;
    }

    public static int numberOfPayments(int years) {
        return years * 12;
    }

    public static double monthlyPayment(double principal, double monthlyRate, int n) {
        if (monthlyRate == 0) return principal / n;
        return principal * (monthlyRate * Math.pow(1 + monthlyRate, n)) / (Math.pow(1 + monthlyRate, n) - 1);
    }

    public static double totalPayment(double monthlyPayment, int n) {
        return monthlyPayment * n;
    }

    public static double totalInterest(double totalPayment, double principal) {
        return totalPayment - principal;
    }

    public static double roundUpToCent(double amount) {
        return Math.ceil(amount * 100.0) / 100.0;
    }
}
