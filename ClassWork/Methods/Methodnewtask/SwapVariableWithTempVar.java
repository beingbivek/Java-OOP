package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class SwapVariableWithTempVar {
    static void swapVarible(int a,int b){
        int c = a;
        a=b;
        b=c;
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for a: ");
        int a = sc.nextInt();
        System.out.println("Enter number for b: ");
        int b = sc.nextInt();
        sc.close();
        swapVarible(a,b);
    }
}
