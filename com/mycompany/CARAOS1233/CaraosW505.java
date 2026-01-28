/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *Write a Java program that asks the user to enter the movie
name, adult ticket price, child ticket price, number of adult
tickets sold, number of child tickets sold, and the percentage
of donation.
 * @author rcaraos
 */


import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
public class CaraosW505 {
    public static void main (String [] args){
        
  
     ImageIcon icon = new ImageIcon(
    CaraosW505.class.getResource("C:\\Users\\rcaraos\\Downloads\\MovieIcon.png"));
     
        
        String Movie = JOptionPane.showInputDialog("Enter the Movie Name: ");
        String AdultP = JOptionPane.showInputDialog("Enter Adult Ticket Price: ");
        int PriceA = Integer.parseInt(AdultP);
        String ChildP = JOptionPane.showInputDialog("Enter Child Ticket Price");
        int PriceC = Integer.parseInt(ChildP);
        
        String AdultS = JOptionPane.showInputDialog("Enter Adult Ticket Sold: ");
        int SoldA = Integer.parseInt(AdultS);
        String ChildS = JOptionPane.showInputDialog("Enter Child Ticket Sold:");
        int SoldC = Integer.parseInt(ChildS);
        
        String Donation = JOptionPane.showInputDialog("Enter Percentage of Donation");
        double Percent = Double.parseDouble(Donation);
        
       int Sold = SoldA + SoldC;
       double Gross = ((PriceA * SoldA)+(PriceC * SoldC) );
       
       double Donated = ((Percent/100) * Gross);
       
       double NetSale = Gross - Donated;
       
       JOptionPane.showMessageDialog (null, String.format("""
                                                          Movie Name: %s 
                                                          Number of Tickets Sold: %d 
                                                          Gross Amount: $%.2f 
                                                          Percentage of the Gross Amount Donated: %.2f%% 
                                                          Amount Donated: $%.2f 
                                                          Net Sale: $%.2f""", 
               
               Movie ,
               Sold ,
               Gross,
               Percent ,
               Donated,
               NetSale),
    "Movie Sales Report",
    JOptionPane.INFORMATION_MESSAGE,
    icon);
               
    }
    
}
