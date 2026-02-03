package com.mycompany.caraos;

import java.util.Scanner;

public class CaraosW601 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double InDeposit;
        double MonDeposit;
        double MonInterest;
        int Months;

        System.out.print("Please input Initial Deposit: ");
        InDeposit = sc.nextDouble();

        System.out.print("Please input Monthly Deposit: ");
        MonDeposit = sc.nextDouble();

        System.out.print("Please input Monthly Interest (%): ");
        MonInterest = sc.nextDouble();

        System.out.print("Please input Number of Months: ");
        Months = sc.nextInt();

        double totalDeposits = InDeposit;
        double Balance = InDeposit;

        int Counter = 1;

      
        while (Counter <= Months) {
            Balance += MonDeposit;            
            totalDeposits += MonDeposit;
            Balance += Balance * (MonInterest / 100); 
            Counter++;
        }
        
        double totalInterest = Balance - totalDeposits;

        System.out.printf("""
                Final Balance: $%,.2f
                Total Deposits: $%,.2f
                Total Interest Earned: $%,.2f
                """, Balance, totalDeposits, totalInterest);

        sc.close();
    }
}
