import java.util.Scanner;

public class typeCastingAlsoAreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length,breadth;
        System.out.print("Enter Length: \n");
        length = sc.nextDouble();
        System.out.print("Enter Breadth: \n");
        breadth = sc.nextDouble();
        sc.close();
        int area = (int) (length * breadth);
        System.out.println("Your Area in int is: "+area);
    }
}
