/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rcaraos
 */
import java.util.Scanner; 

public class W301{ 

    public static void main(String[] args) { 

        double[] inputData = getInput(); 
        int itemsBought = (int) inputData[0]; 
        double pricePerItem = inputData[1]; 
        double discountRate = inputData[2]; 
        double finalAmount = computeFinalAmount(itemsBought, pricePerItem, discountRate); 
        
        displayOutput(itemsBought, pricePerItem, discountRate, finalAmount); 
    } 
    
    public static double[] getInput() { 

        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter number of items bought: "); 
        int itemsBought = sc.nextInt(); 

        System.out.print("Enter price per item: "); 
        double pricePerItem = sc.nextDouble(); 

        System.out.print("Enter discount rate: "); 
        double discountRate = sc.nextDouble(); 

        return new double[]{itemsBought, pricePerItem, discountRate}; 

    } 

    public static double computeFinalAmount(int itemsBought,double pricePerItem, double discountRate) { 

        double totalPrice = itemsBought * pricePerItem; 
        double discountAmount = totalPrice * (discountRate / 100); 
        
        return totalPrice - discountAmount; 

    } 

  


    public static void displayOutput(int itemsBought, double pricePerItem,double discountRate, double finalAmount) { 

  
        System.out.println("\n--- Purchase Summary ---"); 

        System.out.println("Items bought : " + itemsBought); 

        System.out.printf("Price per item : P %.2f%n", pricePerItem); 

        System.out.printf("Discount applied : %.0f%%%n", discountRate); 

        System.out.printf("Final amount to pay : P %.2f%n", finalAmount); 

    } 


   

} 

