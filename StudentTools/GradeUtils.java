package StudentTools;

public class GradeUtils {
    public static double compteAverage(double quiz, double exam){
        return (quiz+exam) /2; 
    }    
    public static String getRemark(double average){
        if(average >= 90){
            return "Excellent";
        } else if(average >= 80){
            return "Good";
        } else if(average >= 70){
            return "Fair";
        } else {
            return "Failed u Dumb Bitch";
        }
    }
}
