package com.mycompany.CARAOS1233;
// To access scanner (User Input)
import java.util.Scanner;

public class CARAOSW204 {
    public static void main(String[] args) {
        final double INCH_TO_CM = 2.54;
        // User Input 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width in inches: ");
        double width = scanner.nextDouble();
        scanner.close();
        calculation(length, width, INCH_TO_CM);
    }
    // Function for Calculation 
    public static void calculation(double length, double width, double INCH_TO_CM) {

        double areaInches = length * width;
        double perimeterInches = 2 * (length + width);
        double areaCm = areaInches * INCH_TO_CM * INCH_TO_CM;
        double perimeterCm = perimeterInches * INCH_TO_CM;
        printResults(areaInches, perimeterInches, areaCm, perimeterCm);
    }
    // Function for Printing Results
    public static void printResults (double areaInches, double perimeterInches, double areaCm, double perimeterCm) {
        System.out.println("Area (sq. inches): " + areaInches);
        System.out.println("Perimeter (inches): " + perimeterInches);
        System.out.println("Area (sq. cm): " + areaCm);
        System.out.println("Perimeter (cm): " + perimeterCm);
    }
}
