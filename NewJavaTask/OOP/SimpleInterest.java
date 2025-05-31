package NewJavaTask.OOP;

public class SimpleInterest {
    private double principal;
    private double time;
    private double rate;

    // setter methods
    public void setPrincipal(double p) {
        principal = p;
    }

    public void setTime(double t) {
        time = t;
    }

    public void setRate(double r) {
        rate = r;
    }

    // getter methods
    public double getPrincipal() {
        return principal;
    }

    public double getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }

    // method to calculate interest
    public double calculateInterest() {
        return (principal * time * rate) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();

        si.setPrincipal(10000);
        si.setTime(2);
        si.setRate(5.5);

        System.out.println("Principal: " + si.getPrincipal());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}

