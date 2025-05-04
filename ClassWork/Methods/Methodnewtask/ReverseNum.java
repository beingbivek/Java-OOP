package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class ReverseNum {
    static void revesreNumberPrint(int number){
        int revNum = 0;
        while (number!=0) {
            revNum = revNum * 10 + number % 10;
            number /= 10;
        }
        System.out.println(revNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed: ");
        int n = sc.nextInt();
        sc.close();

        revesreNumberPrint(n);
    }
}
