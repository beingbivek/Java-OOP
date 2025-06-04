package JavaTaskJune2;

class Shape{
    int length,breadth,radius;
    Shape(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    Shape(int radius){
        this.radius = radius;
    }
}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        super(length,breadth);
    }
    void calculateArea(){
        System.out.println(super.length * super.breadth);
    }
}

class Squares extends Shape{
    Squares(int length){
        int breadth = length;
        super(length,breadth);
    }
    void calculateArea(){
        System.out.println(super.length * super.breadth);
    }
}

class Circle extends Shape{
    public Circle(int radius){
        super(radius);
    }
    void calculateArea(){
        System.out.println(3.14*super.radius*super.radius);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.calculateArea();
        Squares squares = new Squares(5);
        squares.calculateArea();
        Circle circle = new Circle(4);
        circle.calculateArea();
    }
}
