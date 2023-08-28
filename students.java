import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int age;
    private String gender;
    private int sub1;
    private int sub2;
    private int totalMarks;
    private double percentage;
    private char grade;

    public void inputDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            rollNo = scanner.nextInt();

            System.out.print("Enter age: ");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter gender: ");
            gender = scanner.nextLine();

            System.out.print("Enter marks for Subject 1: ");
            sub1 = scanner.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            sub2 = scanner.nextInt();
        }
    }

    public void calculateTotalMarks() {
        totalMarks = sub1 + sub2;
    }

    public void calculatePercentage() {
        percentage = totalMarks / 2.0;
    }

    public void calculateGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------------------");
    }
}

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();
            students[i].calculateTotalMarks();
            students[i].calculatePercentage();
            students[i].calculateGrade();
        }

        System.out.println("----- Student Details -----");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }
    }
}
