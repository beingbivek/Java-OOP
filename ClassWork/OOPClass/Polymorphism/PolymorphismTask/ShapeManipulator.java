abstract class Shape {
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println("Resized circle to radius: " + radius);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating circle by " + angle + " degrees (no visible effect).");
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void resize(double factor) {
        side *= factor;
        System.out.println("Resized square to side length: " + side);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating square by " + angle + " degrees.");
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println("Resized triangle to base: " + base + ", height: " + height);
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating triangle by " + angle + " degrees.");
    }
}

public class ShapeManipulator {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Triangle(3, 6)
        };

        for (Shape shape : shapes) {
            System.out.println("Manipulating " + shape.getClass().getSimpleName());
            shape.resize(1.5);
            shape.rotate(45);
            System.out.println("-----");
        }
    }
}
