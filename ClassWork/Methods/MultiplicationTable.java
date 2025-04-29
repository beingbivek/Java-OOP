package ClassWork.Methods;

import java.util.Scanner;

public class MultiplicationTable {
    static void multiplicationTable(int n){
        for(int i = 1;i<=10;i++){
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        multiplicationTable(num);
    }
}
