package Week1.loops;

import java.util.Scanner;

public class PrintOneToTen {
    public static void main(String[] args) {
        // int i = 1;
        // While loop
        // while (i<=100){
        //     System.out.println(i);
        //     i++;
        // }
        //Do while loop
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // i = 1;
        // do{
        //     System.out.println(n + " * " + i + " = " + n*i);
        //     i++;
        // }while(i<=10);


        // Count numbers
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        System.out.println(count);

        // 
        sc.close();
    }
}
