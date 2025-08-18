public class Main {
    public static void main(String[] args) {
        String student = "John Smith";
        double avg = new GradeCalculator().calculateAverage(85.5, 92.0, 78.5, 90.0);
        String grade = new GradeCalculator().getLetterGrade(avg);

        new GradeCalculator().displayResult(student, avg);
        new GradeCalculator().displayResult(student, avg, grade);
    }
}