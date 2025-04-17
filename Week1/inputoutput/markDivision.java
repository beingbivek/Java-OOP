import java.util.Scanner;

public class markDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math,physics,chemistry,biology,total;
        float percentage;
        System.out.println("Welcome to your Marksheet.");
        System.out.println("Enter Marks in Math:");
        math = sc.nextInt();
        System.out.println("Enter Marks in Physics:");
        physics = sc.nextInt();
        System.out.println("Enter Marks in chemistry:");
        chemistry = sc.nextInt();
        System.out.println("Enter Marks in biology:");
        biology = sc.nextInt();
        total = math + physics + chemistry + biology;
        percentage = (total/400.0f) * 100;
        sc.close();
        String division = (percentage >= 70) ? "First Class" : (percentage > 59) ? "Upper Second Class" : (percentage > 49) ? "Second class" : (percentage > 39) ? "Third class" : "Fail";
        System.out.println("The division is: " + division);
    }
    
}
