package StudentTools;

import java.util.Scanner;
public class CaraosUDP {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Quiz Score: ");
    double quizScore = sc.nextDouble();
    System.out.print("Enter Exam Score: ");
    double examScore = sc.nextDouble(); 

    Student student = new Student(name, quizScore, examScore);
    double average = GradeUtils.compteAverage(student.getQuizScore(), student.getExamScore());
    String remark = GradeUtils.getRemark(average);
    MessagePrinter.printReport(student.getName(), average, remark);
    sc.close();
    }
}