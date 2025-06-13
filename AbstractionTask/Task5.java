package AbstractionTask;

import java.util.Scanner;

abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length, breadth, height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length * breadth * height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + breadth + height);
    }
}

class Cylinder extends Draw {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Draw shape = null;

        System.out.println("Select a shape:");
        System.out.println("1. Cube");
        System.out.println("2. Cuboid");
        System.out.println("3. Cylinder");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side length of cube: ");
                double side = sc.nextDouble();
                shape = new Cube(side);
                break;

            case 2:
                System.out.print("Enter length of cuboid: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of cuboid: ");
                double breadth = sc.nextDouble();
                System.out.print("Enter height of cuboid: ");
                double heightCuboid = sc.nextDouble();
                shape = new Cuboid(length, breadth, heightCuboid);
                break;

            case 3:
                System.out.print("Enter radius of cylinder: ");
                double radius = sc.nextDouble();
                System.out.print("Enter height of cylinder: ");
                double heightCylinder = sc.nextDouble();
                shape = new Cylinder(radius, heightCylinder);
                break;

            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.printf("Volume: %.2f\n", shape.calculateVolume());
        System.out.printf("Area: %.2f\n", shape.calculateArea());
        System.out.printf("Perimeter: %.2f\n", shape.calculatePerimeter());

        sc.close();
    }
}
