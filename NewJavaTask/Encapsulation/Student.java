package NewJavaTask.Encapsulation;

public class Student {
    private String studentName;
    private String studentId;
    private final double gpa;  // GPA is read-only

    // constructor to set name, ID, and GPA
    public Student(String name, String id, double gradePoint) {
        studentName = name;
        studentId = id;
        gpa = gradePoint;
    }

    // setter methods for name and ID
    public void setStudentName(String name) {
        studentName = name;
    }

    public void setStudentId(String id) {
        studentId = id;
    }

    // getter methods
    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Student stu = new Student("Anjali", "STU102", 3.85);

        stu.setStudentName("Anjali Sharma");
        stu.setStudentId("STU202");

        System.out.println("Name: " + stu.getStudentName());
        System.out.println("ID: " + stu.getStudentId());
        System.out.println("GPA: " + stu.getGpa());
    }
}

