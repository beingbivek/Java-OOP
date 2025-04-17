import java.util.Scanner;

public class printSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your roll number: ");
        String roll = sc.next();
        System.out.println("Enter your field of interest: ");
        String interest = sc.next();
        sc.close();
        System.out.println("Hey, my name is " + name + " and my roll number is "+ roll +". My field of interest are "+interest+".");
    }
}
