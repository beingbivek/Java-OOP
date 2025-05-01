package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class CompoundInterest {
    public static void calcCompoundInterest(float p,float t, float r,float n){
        double totalAmount = p*Math.pow((1 + (r/(100*n))),(n*t));
        System.out.println("Total Amount: ");
        System.out.printf("%.2f\n",totalAmount);
        System.out.println("Total Interest: ");
        System.out.printf("%.2f",totalAmount-p);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calc Compound Interest:");
        System.out.println("Enter Principle Amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter Time(in years): ");
        float t = sc.nextFloat();
        System.out.println("Enter Annual Rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter Compounding Frequency: ");
        float n = sc.nextFloat();
        sc.close();
        calcCompoundInterest(p,t,r,n);
    }
}
