package com.mycompany.CARAOS1233;
// To access scanner (User Input)
import java.util.Scanner;

public class CARAOSW103 {

    // Main Function - initialize 
    public static void main(String[] args) {
        final double TAX_RATE = 0.12; // 12% tax rate
        /*  Default Version:
        double hoursWorked = 40.0;
        double hourlyRate = 25.0;
        */

        // User Input Version:
        double hoursWorked;
        double hourlyRate;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        hoursWorked = scanner.nextDouble();
        System.out.print("Enter hourly rate: ");
        hourlyRate = scanner.nextDouble();
        scanner.close(); 

        // calculation
        double grossPay = hoursWorked * hourlyRate;
        double tax = grossPay * TAX_RATE;
        double netPay = grossPay - tax;

        printResults(hoursWorked, hourlyRate, grossPay, tax, netPay);
    }

    // Playing around with functions - Ryan
    public static void printResults(double hoursWorked, double hourlyRate, double grossPay, double tax, double netPay) {
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: PHP" + hourlyRate);
        System.out.println("Gross Pay: PHP" + grossPay);
        System.out.println("Tax: PHP" + tax);
        System.out.println("Net Pay: PHP" + netPay);
    }

}