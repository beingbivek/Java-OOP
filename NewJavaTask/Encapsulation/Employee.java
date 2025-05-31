package NewJavaTask.Encapsulation;

public class Employee {
    private String employeeName;
    private int employeeId;
    private double salary;

    // setter methods
    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    // getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // method to update salary safely
    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeName("Kiran");
        emp.setEmployeeId(2001);
        emp.updateSalary(30000);  // initial salary
        emp.updateSalary(5000);   // increment

        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }
}
