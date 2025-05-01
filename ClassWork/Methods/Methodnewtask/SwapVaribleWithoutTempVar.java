package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class SwapVaribleWithoutTempVar {
    static void swapVarible(int a ,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter value for b: ");
        int b = sc.nextInt();
        sc.close();
        swapVarible(a,b);
    }
}
