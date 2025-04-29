package ClassWork.Methods;

import java.util.Scanner;

public class MultiplyThreeNumber {
    static int multipleThree(int i,int j,int k){
        return i*j*k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(multipleThree(a,b,c));
        sc.close();
    }
}
