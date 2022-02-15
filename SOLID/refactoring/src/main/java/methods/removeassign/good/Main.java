package methods.removeassign.good;

public class Main {


    double calculateDiscount(Order order, double totalPrice){
        if (order.getPrice() > 100)
            return (order.getPrice() * order.getOffer()) + totalPrice;
        return totalPrice;
    }
}
