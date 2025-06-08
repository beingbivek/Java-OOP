package JavaTaskJune2;

abstract class Shape {
    public abstract void calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circle Circumference: " + circumference);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Circle circle = new Circle(4);
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
