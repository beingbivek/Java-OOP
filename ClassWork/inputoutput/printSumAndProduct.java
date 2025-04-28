import java.util.Scanner;

public class printSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first,second,sum,product;
        System.out.println("Enter First Number: ");
        first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        second = sc.nextInt();
        sum = first + second;
        product = first * second;
        System.out.println("The sum is " + sum + " and the product is " + product);
        sc.close();
    }
}
