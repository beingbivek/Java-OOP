package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class CubeOfNumber {
    static int findCube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The cube of number "+n+" is: "+findCube(n));
    }
}
