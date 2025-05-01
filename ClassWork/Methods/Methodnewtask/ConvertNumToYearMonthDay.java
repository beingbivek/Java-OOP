package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class ConvertNumToYearMonthDay {
    static void inDifferentTimes(int n){
        int years = n/365;
        int months = (n-(years*365))/30;
        int days = n-(months*30)-(years*365);
        System.out.println(years+" Years "+months+" Months "+days+" Days.");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        inDifferentTimes(n);


    }
}
