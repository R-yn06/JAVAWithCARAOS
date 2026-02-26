/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos; //Change the package name that you are using

/**
 *
 * @author
 */
public class CaraosW901 { //Change into the naming convention, this will affect some parts of the program

    /*
    Scope Detective

    TASK:
    1) Run this program (it will NOT match the expected output).
    2) Modify ONLY the parts marked "FIX HERE" so that the output matches
       the expected output provided by your teacher.

    RULES:
    - Do NOT change any System.out.println(...) lines (labels must remain the same),
      except where a FIX HERE comment explicitly says you may.
    - Do NOT rename the class.
    - Do NOT delete methods.
*/

    static int counter = 100;
    static String label = "CLASS";
    static final int BONUS = 5;

    public static void main(String[] args) {

        System.out.println("=== START ===");
        System.out.println("main sees counter = " + counter);
        System.out.println("main sees label   = " + label);

        int counter = 10;
        String label = "MAIN";

        System.out.println("main local counter = " + counter);
        System.out.println("main local label   = " + label);

        int result1 = compute(counter);
        System.out.println("after compute, main local counter = " + counter);
        System.out.println("after compute, class counter      = " + CaraosW901.counter);
        System.out.println("result1 = " + result1);

        int result2 = updateAndReport(label);
        System.out.println("after updateAndReport, main local label = " + label);
        System.out.println("after updateAndReport, class label      = " + CaraosW901.label);
        System.out.println("result2 = " + result2);

        System.out.println("--- block demo ---");
        int x = 3;
        System.out.println("before block, x = " + x);

        {
            int y = x + 2;

            // FIX HERE (Scope): update the OUTER x so that after the block x becomes 8
            // Current code does not change x.
            x += y; // <-- FIX HERE (you may change/replace this line)

            // FIX HERE (Output must match): print the correct x inside the block
            System.out.println("inside block, x = " + x); // <-- FIX HERE (you may change what is printed)
            System.out.println("inside block, y = " + y);
        }

        System.out.println("after block, x = " + x);

        System.out.println("--- loop demo ---");
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum += i;
            if (i == 2) {
                int inner = 50;
                sum += inner;
                // FIX HERE (Scope/Logic): inner exists only in this block, but must affect sum
                // (Add inner to sum.)
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("=== END ===");
    }

    public static int compute(int counter) {
        System.out.println("[compute] parameter counter = " + counter);

        // FIX HERE (Scope): update the CLASS variable counter (static field),
        // not the parameter counter.
        CaraosW901.counter += BONUS; // <-- FIX HERE

        {
            // FIX HERE (Scope/Logic): temp must print 20 when parameter is 10
            int temp = counter * 2 ; // <-- FIX HERE
            System.out.println("[compute] temp = " + temp);
        }

        // FIX HERE (Scope): return should use parameter + CLASS counter
        return counter + CaraosW901.counter; // <-- FIX HERE (may or may not need change depending on your fix above)
    }

    public static int updateAndReport(String label) {
        System.out.println("[updateAndReport] parameter label = " + label);

        // FIX HERE (Scope): update the CLASS variable label (static field),
        // not the parameter label.
        CaraosW901.label = label + "-UPDATED"; // <-- FIX HERE

        int counter = 7;

        { 
           // FIX HERE (Scope): do NOT create a new variable.
            // Update the existing counter so it becomes 10.
           counter = counter + 3; // <-- FIX HERE
        }

        // FIX HERE (Logic): must return 10
        return counter; // <-- FIX HERE
    }
}