package com.mycompany.caraos;

import java.util.Scanner;

public class CaraosW703 {

    static int Prev1, Prev2, NthTerm, Count;
    static int Current;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        Prev1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        Prev2 = sc.nextInt();

        System.out.print("Enter the nth term: ");
        NthTerm = sc.nextInt();

        Calculation();
    }

    public static void Calculation() {

        if (NthTerm == 1) {
            Current = Prev1;
        } 
        else if (NthTerm == 2) {
            Current = Prev2;
        } 
        else {
            Count = 3; 

            while (Count <= NthTerm) {
                Current = Prev1 + Prev2;
                Prev1 = Prev2;
                Prev2 = Current;
                Count++;
            }
        }

        Printer(Current);
    }

    public static void Printer(int x) {
        System.out.println("Answer: " + x);
    }
}
