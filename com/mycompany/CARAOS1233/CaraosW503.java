/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rcaraos
 */
public class CaraosW503 {
    public static void main(String[] args) { 
         try{
            Scanner inFile = new Scanner
            (new FileReader("C:\\Users\\rcaraos\\Desktop\\numbers.txt"));
               int x = inFile.nextInt();
               int y = inFile.nextInt();
             int quotient = x / y ;
               inFile.close();    
             System.out.println("Result:" + quotient);
         }
         catch (ArithmeticException e){
             System.out.println("You cannot Divide by 0");
         }
         catch (InputMismatchException e){
             System.out.println("You cannot Divide by non-numeric Value");
         }
         catch (FileNotFoundException e){
             System.out.println("File does not Exist");
         }
            System.out.println("The system is running well");            
 
    }
       
}
