package com.mycompany.CARAOS1233;
// To access scanner (User Input)
import java.util.Scanner;

public class CARAOSW104 {
    public static void main(String[] args) {
        final double INCH_TO_CM = 2.54;

        double length;
        double width;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        length = scanner.nextDouble();
        System.out.print("Enter width in inches: ");
        width = scanner.nextDouble();
        scanner.close();
        calculationPrint(length, width, INCH_TO_CM);
    }
    // Function for Calculation and Printing
    public static void calculationPrint(double length, double width, double INCH_TO_CM) {

        double areaInches = length * width;
        double perimeterInches = 2 * (length + width);
        double areaCm = areaInches * INCH_TO_CM * INCH_TO_CM;
        double perimeterCm = perimeterInches * INCH_TO_CM;

        System.out.println("Area (sq. inches): " + areaInches);
        System.out.println("Perimeter (inches): " + perimeterInches);
        System.out.println("Area (sq. cm): " + areaCm);
        System.out.println("Perimeter (cm): " + perimeterCm);
    }
}
