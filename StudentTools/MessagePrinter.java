package StudentTools;

public class MessagePrinter {
    public static void printReport (String name, double average, String remark){
        System.out.println("----- Student Report -----");
        System.out.println("Student Name: " + name);
        System.out.println("Average Score: " + average);
        System.out.println("Remark: " + remark);
    }
}
