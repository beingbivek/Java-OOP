package ClassWork.Methods;

public class DiscountCalculator {
    static double discountCalc(double price, double discount){
        double discountedPrice = price * discount;
        double finalPrice = price - discountedPrice;
        return finalPrice;
    }
    public static void main(String[] args) {
        double groceryDiscount = 0.05;
        double groceryPrice = 20;
        double groceryFinalPrice = discountCalc(groceryPrice, groceryDiscount);

        System.out.println(groceryFinalPrice);
    }
}
