package StudentTools;

public class Student {
    private String name;
    private double quizScore;
    private double examScore;

    public Student(String name, double quizScore, double examScore) {
        this.name = name;
        this.quizScore = quizScore;
        this.examScore = examScore;
    }

    public String getName() {
        return name;
    }

    public double getQuizScore() {
        return quizScore;
    }

    public double getExamScore() {
        return examScore;
    }
}
