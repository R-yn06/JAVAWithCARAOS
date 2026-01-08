/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rcaraos
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CARAOSW302 {
    public static void main(String[] args) 
                throws FileNotFoundException{ 
        Scanner inFile = new Scanner
            (new FileReader("C:\\Users\\rcaraos\\Desktop\\input.txt"));
        String Name;
        double Grade;
        
        Name = inFile.nextLine();
        Grade = inFile.nextDouble();
        
        System.out.println("Student Name: "+Name);

        System.out.print("Grade: "+Grade); 
        inFile.close();
 
    }
            
}
