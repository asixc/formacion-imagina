package conditionals.polymorphism.good;

public class ProductMedium extends Product{

    ProductMedium(Double price) {
        super(price);
    }

    @Override
    public double calculatePrice() {
        return this.price + price * COMMISSION + SHIPPING;
    }
}
