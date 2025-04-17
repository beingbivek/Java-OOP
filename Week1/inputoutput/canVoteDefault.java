import java.util.Scanner;

public class canVoteDefault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 18;
        String validation = (age >= 18) ? "Can Vote" : "Cannot Vote";
        System.out.println(validation);
        sc.close();
    }
}
