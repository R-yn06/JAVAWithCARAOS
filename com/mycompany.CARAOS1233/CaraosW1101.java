package com.mycompany.caraos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rcaraos
 */

import java.util.Scanner;

public class CaraosW1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Year Level: ");
        int yearLevel = sc.nextInt();

        //  object for Class Student
        Student StudentClass = new Student();
        // Setting Values
        StudentClass.setStudentInfo(name, course, yearLevel);
        StudentClass.displayStudentInfo();

        sc.close();
    }
}

class Student {
    //Data Members
    private String name;
    private String course;
    private int yearLevel;

    //set student info
    public void setStudentInfo(String N, String C, int Y) {
        this.name = N;
        this.course = C;
        this.yearLevel = Y;
    }

    // display student info
    public void displayStudentInfo() {
        
        System.out.printf("""
                          Student Information
                          -------------------
                          Name:        %s
                          Course:      %s
                          Year Level:  %d
                          """, 
                name,
                course,
                yearLevel);

    }
}

