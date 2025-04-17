import java.util.Scanner;

public class printDivisionOfSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first,second,sum,product,divison;
        System.out.println("Enter First Number: ");
        first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        second = sc.nextInt();
        sum = first + second;
        product = first * second;
        divison = sum / product;
        System.out.println("The sum is " + sum + " and the product is " + product);
        sc.close();
        System.out.println("and the division is: " + divison);
    }
}
