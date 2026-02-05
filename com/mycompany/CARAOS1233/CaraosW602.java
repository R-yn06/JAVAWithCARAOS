package com.mycompany.caraos;

import java.util.Scanner;

public class CaraosW602 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double grade = 0;
        int count = 0;
        int passed = 0;
        int failed = 0;

        double total = 0;
        double highest = Integer.MIN_VALUE;
        double lowest = Integer.MAX_VALUE;

        while (grade != -1) {
            System.out.print("Please input grade (or -1 to stop): ");
            grade = sc.nextDouble();
            
            
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter 0–100 only.");
                continue;
            }

            total += grade;
            count++;

            if (grade >= 75) {
                passed++;
            } else {
                failed++;
            }

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }
        if (count > 0) {
            double average = total / count;

            System.out.println("Number of valid grades: " + count);
            System.out.printf("Average grade: %.2f%n", average);
            System.out.println(" " + highest);
            System.out.println("Lowest grade: " + lowest);
            System.out.println("Passed: " + passed);
            System.out.println("Failed: " + failed);
            
        } else {
            System.out.println("No valid grades were entered.");
        }

        sc.close();
    }
}
