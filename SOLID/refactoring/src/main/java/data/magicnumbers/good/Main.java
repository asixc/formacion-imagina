package data.magicnumbers.good;

public class Main {

    public static final double DEFAULT_PRICE_SHIPPING = 4.99;
    public static final int PAY_SHIPPING_FREE = 0;
    public static final int MIN_TO_PAY_FOR_FREE_SHIPPING = 100;
    public static final double DISCOUNT_PERCENTAGE = 0.1;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
    	return price < MIN_TO_PAY_FOR_FREE_SHIPPING ? DEFAULT_PRICE_SHIPPING : PAY_SHIPPING_FREE; // hard coded
        
    }

    private static double calculateDiscount(double price) {
        return price * DISCOUNT_PERCENTAGE;
    }
}
