package com.mycompany.CARAOS1233;

import java.util.Scanner;
public class CARAOSW202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        celsiusToFahrenheit(celsius);
        printTemperatures(celsius);
    }

    public static double celsiusToFahrenheit(double celsius) {
        final double FACTOR = 9.0 / 5.0;
        return (celsius * FACTOR) + 32;
    }

    public static void printTemperatures(double celsius) {
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
