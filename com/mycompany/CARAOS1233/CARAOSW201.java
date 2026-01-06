package com.mycompany.CARAOS1233;

public class CARAOSW201 {
    public static void main(String[] args) {
    int x = 5;
    int y = 0;
    System.out.println("Initial value of x: " + x);
    PreIncrement(x, y);
    PostIncrement(x, y);
    PreDecrement(x, y);
    PostDecrement(x, y);
    }
    // Pre-increment
    public static void PreIncrement (int x, int y) {
    y = ++x; 
    System.out.println("\nAfter pre-increment (++x):");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    x = 5;
    }
    // Post-increment
    public static void PostIncrement (int x, int y) {
 
     y = x++; 
    System.out.println("\nAfter post-increment (x++):");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    x = 5;
    }
     // Pre-decrement
    public static void PreDecrement (int x, int y) {
    y = --x; 
    System.out.println("\nAfter pre-decrement (--x):");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    x = 5;
    }
    // Post-decrement
    public static void PostDecrement (int x, int y) {
    y = x--; 
    System.out.println("\nAfter post-decrement (x--):");
    System.out.println("x = " + x);
     System.out.println("y = " + y);
    x = 5;
    }
}

