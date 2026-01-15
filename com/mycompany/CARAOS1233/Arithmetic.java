import java.util.Scanner;
import java.lang.Math;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.println ("input 4 terms of an Arithmetic Sequence:");
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        int A4 = sc.nextInt();


        Calculate ( A1, A2, A3, A4);
        sc.close();
    }
    
    public static void Calculate ( int A1, int A2, int A3, int A4) {
        Scanner sc = new Scanner (System.in);
        int difference = A2 - A1;
         if (difference != A3 - A2 || difference != A4 - A3) {
            System.out.println ("Not Arithmetic Sequence");
            if (A2 /A1 == A3 / A2 && A3 / A2 == A4 / A3) {
                System.out.println ("This is a Geometric Sequence");
                Geometric ( A1, A2, A3, A4);
            }
            else {
                
                System.out.println ("Not a Sequence");
            }
         }
         else {
             System.out.println ("Input the Term number to find:");
            int Term = sc.nextInt();
            int Result = A1 + (Term - 1)*difference;
            System.out.println (Result);
         }
       sc.close();
    }

    public static void Geometric (int A1, int A2, int A3, int A4) {
        Scanner sc = new Scanner (System.in);
        int ratio = A2 / A1;
            System.out.println ("Input the Term number to find:");
            int Term = sc.nextInt();
            int Result = (int) (A1 * Math.pow(ratio, Term - 1));
            System.out.println (Result);
         
       sc.close();
    }
}