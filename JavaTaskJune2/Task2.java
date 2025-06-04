package JavaTaskJune2;

class Employee{
    public void work(){
        System.out.println("Employee Works!");
    }
    public void getSalary(){
        System.out.println("Salary deposited!");
    }
}

class HRManager extends Employee{
    public void work(){
        System.out.println("Hires an Employee");
    }
}
public class Task2 {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
    }
}
