import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaraosWExercerise {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        int N = 0;
        int Q = 0;
        boolean terminate = false;

        do {
            String input = JOptionPane.showInputDialog(null,"\n1 - Encode students and print report\n2 - Exit");
            if (input == null) {
                // User cancelled the dialog
                break;
            }
            choice = Integer.parseInt(input);

            if (choice == 1) {

                String studentInput = JOptionPane.showInputDialog(null,"Enter the Number of Students: ");
                do {
                    N = Integer.parseInt(studentInput);
                    if (N < 1) {
                        studentInput = JOptionPane.showInputDialog(null,"Invalid. Must be at least 1.");
                    }
                } while (N < 1);

                
                do {
                    String quizInput = JOptionPane.showInputDialog(null,"Enter the Number of Quizzes: ");
                    Q = Integer.parseInt(quizInput);
                    if (Q < 1) {
                        quizInput = JOptionPane.showInputDialog(null,"Invalid. Must be at least 1.");
                    }
                } while (Q < 1);

                // CLASS SUMMARY
                double classTotal = 0;
                double highest = -1;
                double lowest = 101;
                String highestName = "";
                String lowestName = "";

                int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

                printLine('=' ,40);
                System.out.println("        STUDENT GRADEBOOK REPORT");
                printLine('=' ,40);

                for (int i = 1; i <= N; i++) {

                    double Total = 0;
                    int count = 0;

                    System.out.println("\nEnter Name:");
                    String Name = sc.nextLine();

                    System.out.println("Enter Course Taken:");
                    String Course = sc.nextLine();

                    System.out.print("Enter Year Level (1-4): ");
                    int YearLevel = sc.nextInt();

                   int quizScore = 0;
                    try{
                    for (int j = 1; j <= Q; j++) {

                        System.out.printf("Enter Quiz #%d (0 to 100): ", j);
                        quizScore = sc.nextInt();

                        if (quizScore < 0 || quizScore > 100) {
                            System.out.println("Invalid score. Must be 0 to 100. Re-enter this quiz.");
                            j--;
                            continue;
                        }
                        Total += quizScore;
                        count++;
                    }
                    } catch(InputMismatchException e){
                        System.out.println("Invalid input. Please enter a number. Re-enter this quiz.");
                        sc.next(); // Clear the invalid input
                        j--; // Decrement to retry this quiz
                    }


                        

                    sc.nextLine();

                    double Average = computeAverage(Total, count);
                    char LetterGrade = getLetterGrade(Average);

                    // CLASS SUMMARY TRACKING
                    classTotal += Average;

                    
                    if (Average > highest) {
                        highest = Average;
                        highestName = Name;
                    }

                    if (Average < lowest) {
                        lowest = Average;
                        lowestName = Name;
                    }

                    if (LetterGrade == 'A') countA++;
                    else if (LetterGrade == 'B') countB++;
                    else if (LetterGrade == 'C') countC++;
                    else if (LetterGrade == 'D') countD++;
                    else countF++;

                    // STUDENT REPORT
                    System.out.println();
                    System.out.println("Student: " + Name);
                    System.out.println("Course : " + Course);
                    System.out.println("Year   : " + YearLevel);
                    System.out.printf("Avg    : %.2f\n", Average);
                    System.out.println("Grade  : " + LetterGrade);
                    System.out.print("Bar    : ");
                    printBar(Average);
                    printLine('-',50);
                }

                double classAverage = computeAverage(classTotal, N);

                // CLASS SUMMARY OUTPUT
                System.out.println("\nCLASS SUMMARY");
                System.out.printf("Class Average : %.2f\n", classAverage);
                System.out.printf("Highest Avg   : %.2f (%s)\n", highest, highestName);
                System.out.printf("Lowest Avg    : %.2f (%s)\n", lowest, lowestName);
                System.out.printf("Grade Counts  : A=%d B=%d C=%d D=%d F=%d\n",
                        countA, countB, countC, countD, countF);

            }

            else if (choice == 2) {
                System.out.println("Shutting down...");
                break;
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (!terminate);
    }

    public static double computeAverage(double total, int count) {
        return total / count;
    }

    public static char getLetterGrade(double average) {

        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    public static void printLine(char ch, int howMany) {

        for (int i = 0; i < howMany; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void printLine(int howMany) {
        printLine('=', howMany);
    }

    public static void printBar(double average) {

        int stars = (int) (average / 10);
        if (stars > 10) stars = 10;

        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}