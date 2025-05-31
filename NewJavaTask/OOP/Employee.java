package NewJavaTask.OOP;

public class Employee {
    private String empName;
    private String jobTitle;
    private double salary;

    // constructor
    public Employee(String name, String title, double initialSalary) {
        empName = name;
        jobTitle = title;
        salary = initialSalary;
    }

    // method to increase salary
    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }

    // method to display employee info
    public void showDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Current Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Ravi", "Software Engineer", 45000);
        emp.increaseSalary(5000);
        emp.showDetails();
    }
}

