package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class PrintOddNumbersToN {
    static void printOddNumber(int num){
        for(int i = 1;i<=num;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        sc.close();
        printOddNumber(n);
    }
}
