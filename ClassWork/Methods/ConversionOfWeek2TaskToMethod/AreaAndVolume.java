package ClassWork.Methods.ConversionOfWeek2TaskToMethod;

import java.util.Scanner;

public class AreaAndVolume {
    static void areaOfTraingle(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter height of traingle: ");
        int h = sc2.nextInt();
        System.out.println("Enter base of traingle: ");
        int b = sc2.nextInt();
        sc2.close();
        double area = 0.5 * b * h;
        System.out.println("The area of triangle is "+area);
    }
    static void volumeOfCuboid(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Volume of Cuboid");
        System.out.println("Enter length: ");
        int l = sc3.nextInt();
        System.out.println("Enter width: ");
        int w = sc3.nextInt();
        System.out.println("Enter height: ");
        int h = sc3.nextInt();
        sc3.close();
        double volume = l * w * h;
        System.out.println("The volume of cuboid is "+volume);
    }
    static void volumeOfCube(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Volume of Cube:");
        System.out.println("Enter side: ");
        int side = sc1.nextInt();
        sc1.close();
        System.out.println("The volume of cube is "+side*side*side);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a task(1-3):\n1. Area of Triangle\n2. Volume of Cuboid\n3. Volume of cube\n");
        int n = sc.nextInt();
        sc.close();
        
        switch (n) {
            case 1:
                areaOfTraingle();
                break;
                
            case 2:
                volumeOfCuboid();
                break;

                case 3:
                volumeOfCube();
                break;
        
                default:
                System.out.println("Incorrect Selection.");
                break;
            }
        }
    
}
