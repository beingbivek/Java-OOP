import java.util.Scanner;

public class IOoperations {
    public static void main(String[] args) {
        char varName = 'a'; // String use double quotes and char uses single quotes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your gpa: ");
        double gpa = sc.nextDouble();
        System.out.println("Enter your char: ");
        char char1 = sc.next().charAt(0);
        System.out.println(age + "\n" + name + "\n" + gpa + "\n" + varName + "\n" + char1);
        sc.close();
    }
}
