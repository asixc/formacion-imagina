package conditionals.polymorphism.good;

public class ProductPremium extends Product {

    ProductPremium(Double price) {
        super(price);
    }

    @Override
    public double calculatePrice() {
        return this.price + price * COMMISSION;
    }
}
