package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class HarshadNumber {
    static boolean isHarshadNumber(int a){
        int sumOfDigits = 0;
        int original = a;
        while (a!=0) {
            sumOfDigits += a % 10;
            a /= 10;
        }
        if (original%sumOfDigits==0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(isHarshadNumber(n)){
            System.out.println(n+" is a Harshad Number.");
        }else{
            System.out.println(n+" isnot a harshad number.");
        }
        
    }
}
