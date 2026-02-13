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
public class CaraosW701 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Enter a Positive Integer: ");
            N = sc.nextInt();

            if (N < 0) {
                System.out.println("ERROR: Enter a Positive Integer");
            }

        } while (N < 0);

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        sc.close(); 
    }
}

