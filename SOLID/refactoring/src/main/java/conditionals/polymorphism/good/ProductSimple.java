package conditionals.polymorphism.good;

public class ProductSimple extends Product {

    public ProductSimple(double price) {
        super(price);
    }

    @Override
    public double calculatePrice() {
        return this.price + SHIPPING;
    }
}
