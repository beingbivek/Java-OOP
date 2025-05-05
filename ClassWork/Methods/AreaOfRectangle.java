package ClassWork.Methods;

import java.util.Scanner;

public class AreaOfRectangle {
    static void calcArea(int h,int b){
        System.out.println("The area of rectangle is: "+h*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        int h = sc.nextInt();
        System.out.println("Enter base: ");
        int b = sc.nextInt();

        sc.close();
        calcArea(h,b);        
    }
}
