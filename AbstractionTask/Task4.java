package AbstractionTask;

import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {
    private double a, b, c; // sides of the triangle

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Circle Area: %.2f\n", circle.calculateArea());
        System.out.printf("Circle Perimeter: %.2f\n\n", circle.calculatePerimeter());

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.printf("Rectangle Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Rectangle Perimeter: %.2f\n\n", rectangle.calculatePerimeter());

        System.out.print("Enter side a of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c of triangle: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle(a, b, c);
        System.out.printf("Triangle Area: %.2f\n", triangle.calculateArea());
        System.out.printf("Triangle Perimeter: %.2f\n", triangle.calculatePerimeter());

        sc.close();
    }
}
