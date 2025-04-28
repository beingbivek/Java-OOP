import java.util.Scanner;

public class canVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        String validation = (age >= 18) ? "Can Vote" : "Cannot Vote";
        System.out.println(validation);
        sc.close();
    }
}
