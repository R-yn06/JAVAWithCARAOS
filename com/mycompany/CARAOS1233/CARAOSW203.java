package com.mycompany.CARAOS1233;
/*

Good Day Sir, There has been a mix up with my submitted W203 file, 
as it was the wrong file. I apologize for the inconvenience. 
hence I am Resubmitting again, with this being the final file
 */
import java.util.Scanner;

public class CARAOSW203 {
    
    // Main Function - initialize 
    public static void main(String[] args) {
        final double TAX_RATE = 0.12; // 12% tax rate


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        scanner.close(); 

        // calculation
        double grossPay = hoursWorked * hourlyRate;
        double tax = grossPay * TAX_RATE;
        double netPay = grossPay - tax;

        printResults(hoursWorked, hourlyRate, grossPay, tax, netPay);
    }

    //functions for results
    public static void printResults(double hoursWorked, double hourlyRate, double grossPay, double tax, double netPay) {
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Rate: PHP%.2f%n", hourlyRate);
        System.out.printf("Gross Pay: PHP%.2f%n", grossPay);
        System.out.printf("Tax: PHP%.2f%n", tax);
        System.out.printf("Net Pay: PHP%.2f%n", netPay);
    }

}
