class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    Student(String nameInput, int ageInput, String courseInput, double g1, double g2, double g3){
        name = nameInput;
        age = ageInput;
        course = courseInput;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90){
            return "A";
        }
        else if (avg >= 80){
            return "B";
        }
        else if (avg >= 70){
            return "C";
        }
        else if (avg >= 60){
            return "D";
        }
        else {
            return "F";
        }
    }

    boolean isPassing() {
        return calculateAverage() >= 70;
    }
}
