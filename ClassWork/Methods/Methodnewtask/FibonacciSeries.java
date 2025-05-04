package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class FibonacciSeries {
    static void printFibonacci(int num){
        int start = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < num; i++){
            System.out.println(start);
            sum = start + second;
            start = second;
            second = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci: ");
        int n = sc.nextInt();
        sc.close();

        printFibonacci(n);
    }


}
