package assignment;

public class CalculateDiscount {
    public static void main(String[] args) {
        double price = 2500.0;
        double discount = (price > 2000.0) ? price * 0.15 : price * 0.08;
        double finalPrice = price - discount;
        System.out.println("Final price: " + finalPrice);
    }
}
