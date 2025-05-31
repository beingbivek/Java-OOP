package NewJavaTask.OOP;

public class Circle {
    private double radius;

    // setter method
    public void setRadius(double r) {
        radius = r;
    }

    // getter method
    public double getRadius() {
        return radius;
    }

    // method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setRadius(7.5);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Circumference: " + myCircle.calculateCircumference());
    }
}

