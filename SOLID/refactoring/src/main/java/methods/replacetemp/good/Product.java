package methods.replacetemp.good;

public class Product {

    public static final double FIX_VALUE = 2.0;
    public static final int MIN_QUANTITY_PRICE = 100;
    private double price;
    private int quantity;

    void printProductPrice(){
        // ....

        // ...
        if (isMoreThanTheMinimunQuantity()){

        }else{

        }
        // ....

    }

    private boolean isMoreThanTheMinimunQuantity() {
        return getQuantityPrice() > MIN_QUANTITY_PRICE;
    }

    private double getQuantityPrice() {
        return this.price * this.quantity * FIX_VALUE;
    }

}
