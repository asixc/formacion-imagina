package methods.extractvariable.good;

public class Main {
	
    static void printProductPrice(Order order){
        final Double totalPrice = order.getTotalPrice();
        
        System.out.println(totalPrice);
    }

    public static void main(String[] args) {
        final Order order = new Order(10.0, 1, 1.0 ,5.99);
        printProductPrice(order);
    }

}
