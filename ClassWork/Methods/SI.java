package ClassWork.Methods;

import java.util.Scanner;

public class SI {
    static float simpleInterest(int p,float t,float r){
        return (p*t*r)/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int p = sc.nextInt();
        System.out.println("Enter Time: ");
        float t = sc.nextFloat();
        System.out.println("Enter Rate: ");
        float r = sc.nextFloat();
        sc.close();
        System.out.println("The SI is: " + simpleInterest(p, t, r));
    }
}
