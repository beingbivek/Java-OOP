import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        float SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int principleamt = sc.nextInt();
        System.out.println("Enter time (in years): ");
        float time = sc.nextFloat();
        System.out.println("Enter Rate: ");
        float rate = sc.nextFloat();
        SI = (principleamt * time * rate) / 100;
        System.out.print("The Simple Interest is:" + SI);
        sc.close();
    }
}
