public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Johnden", 22, "BSIT", 84.0, 90.0, 95.0);
        Student s2 = new Student("Borja", 30, "BSIT", 65.0, 58.0, 60.0);
        Student s3 = new Student("Dudotz", 22, "BSIT", 90.0, 80.0, 92.0);

        int passCount = 0;

        s1.displayInfo();
        double avg1 = s1.calculateAverage();
        System.out.println("Average: " + String.format("%.2f", avg1));
        System.out.println("Letter Grade: " + s1.getLetterGrade());
        String status1 = s1.isPassing() ? "PASSING" : "FAILING";
        System.out.println("Status: " + status1 + "\n");
        if (s1.isPassing()) passCount++;

        s2.displayInfo();
        double avg2 = s2.calculateAverage();
        System.out.println("Average: " + String.format("%.2f", avg2));
        System.out.println("Letter Grade: " + s2.getLetterGrade());
        String status2 = s2.isPassing() ? "PASSING" : "FAILING";
        System.out.println("Status: " + status2 + "\n");
        if (s2.isPassing()) passCount++;

        s3.displayInfo();
        double avg3 = s3.calculateAverage();
        System.out.println("Average: " + String.format("%.2f", avg3));
        System.out.println("Letter Grade: " + s3.getLetterGrade());
        String status3 = s3.isPassing() ? "PASSING" : "FAILING";
        System.out.println("Status: " + status3 + "\n");
        if (s3.isPassing()) passCount++;

        System.out.println("Summary: " + passCount + " out of 3 students are passing.");
    }
}
