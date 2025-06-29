public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add two doubles: " + calc.add(5.5, 10.2));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
    }
}
