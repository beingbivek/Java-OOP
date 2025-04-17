import java.util.Scanner;

public class areaVolumeOfTriangleandCube {
    public static void main(String[] args) {
        float height,width,length;
        double answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of triangle: ");
        System.out.println("Enter base of triangle: ");
        width = sc.nextInt();
        System.out.println("Enter height of triangle: ");
        height = sc.nextInt();
        answer = 0.5 * width * height;
        System.out.println("The area of the given Traingle is: " + answer);
        System.out.println("\nVolume of Cube: ");
        System.out.println("Enter side of cube: ");
        width = sc.nextInt();
        answer = width * width * width;
        System.out.println("The volume of the given Cube is: " + answer);
        System.out.println("\nVolume of Cuboid: ");
        System.out.println("Enter length of Cuboid: ");
        length = sc.nextInt();
        System.out.println("Enter height of Cuboid: ");
        height = sc.nextInt();
        System.out.println("Enter width of Cuboid: ");
        width = sc.nextInt();
        answer = length * width * height;
        System.out.println("The volume of the given Cuboid is: " + answer);
        sc.close();
    }
}
