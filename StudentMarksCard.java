public class StudentMarksCard {
    private String studentName;
    private int rollNumber;
    private String grade;
    private int[] marks;

    // Default constructor
    public StudentMarksCard() {
    }

    // Parameterized constructor
    public StudentMarksCard(String studentName, int rollNumber, String grade, int[] marks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.marks = marks;
    }

    // Getter and Setter methods
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}