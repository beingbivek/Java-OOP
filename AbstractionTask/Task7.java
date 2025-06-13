package AbstractionTask;

interface Employee{
    void work();
    double getSalary();
}

class Chefs implements Employee{

    @Override
    public void work() {
        System.out.println("You Cook delicious meals.");
    }

    @Override
    public double getSalary() {
        return 90000;
    }
    
}

class Waiters implements Employee{

    @Override
    public void work() {
        System.out.println("You interact with customers and deliver food.");
    }

    @Override
    public double getSalary() {
        return 35000;
    }

}

public class Task7 {
    public static void main(String[] args) {
        Chefs chefs = new Chefs();
        chefs.work();
        chefs.getSalary();
        Waiters waiters = new Waiters();
        waiters.work();
        waiters.getSalary();
    }
}
