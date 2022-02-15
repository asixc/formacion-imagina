package methods.replacemethod.good;

public class ProductCalculator extends Product {

    public double calculatePrice(){
        double result = 0;
        double priceQuantity = this.price * this.quantity;
        double priceDiscount = this.price * this.discount;
        double priceShipping = shipping * 0.50;

        // .......

        // ......
        return result;
    }

}
