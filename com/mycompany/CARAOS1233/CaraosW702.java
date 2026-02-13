package com.mycompany.caraos;

import javax.swing.JOptionPane;

public class CaraosW702 {

    static int Start;
    static int End;

    public static void main(String[] args) {

        String X = JOptionPane.showInputDialog(null, 
                "Enter the Starting Number:","Starting",JOptionPane.QUESTION_MESSAGE);
        Start = Integer.parseInt(X);

        String Y = JOptionPane.showInputDialog(null, 
                "Enter the Ending Number:");
        End = Integer.parseInt(Y);

        Multiplication();

        System.exit(0); 
    }

    public static void Multiplication() {

        int counter = 0;
        String output = "";

        for (int i = Start; i <= End; i++) {

            for (int j = 1; j <= 10; j++) {

                int result = i * j;

         
                if (result % 2 == 0) {
                    continue;
                }

                output += i + " x " + j + " = " + result + "\n";
                counter++;
            }
        }

        output += "\nTotal odd results: " + counter;

        JOptionPane.showMessageDialog(null, output);
    }
}
