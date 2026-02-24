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

public class CaraosW802 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter average grade: ");
        double average = sc.nextDouble();

        displayResult(average,name);
     
        sc.close();
    } 
    
    
    public static void displayResult( double ave,String Name) {

        String remarks;

        if (ave >= 90 && ave <= 100) {
            remarks = "Excellent";
        } 
        else if (ave >= 75) {
            remarks = "Passed";
        } 
        else {
            remarks = "Failed";
        }
        printer(ave,remarks,Name);
    }
    
    public static void printer(double average,String remarks,String Name){
       
        System.out.println("\nStudent: " + Name);
        System.out.println("Average: " + average);
        System.out.println("Remarks: " + remarks);
    }
}
