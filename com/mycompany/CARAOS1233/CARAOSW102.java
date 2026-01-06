package com.mycompany.CARAOS1233;

/* main function, Good Day Sir, I wanted to experiment with functions using Java hence
 I made a function for Printing and conversion - Ryan Caraos*/  
public class CARAOSW102 {
    public static void main(String[] args) {
        double celsius = 25.0;
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