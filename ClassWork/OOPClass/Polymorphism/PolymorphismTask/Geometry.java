public class Geometry {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Geometry geo = new Geometry();

        System.out.println("Area of Circle: " + geo.calculateArea(7));
        System.out.println("Area of Rectangle: " + geo.calculateArea(5, 10));
        System.out.println("Area of Triangle: " + geo.calculateArea(6, 8, true));
    }
}
