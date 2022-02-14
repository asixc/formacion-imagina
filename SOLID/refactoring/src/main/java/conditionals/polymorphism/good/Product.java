package conditionals.polymorphism.good;

public abstract class Product {

    protected final static Double COMMISSION = 0.10;
    protected final static Double SHIPPING = 5.99;
    protected Double price;

    Product(Double price) {
        this.price = price;
    };
    public abstract double calculatePrice();
}
