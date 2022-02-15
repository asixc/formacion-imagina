package methods.inlinetemp.good;

public class Main {
	
	/*
	 * Calcular si debería tener descuento sí o no
	 */
    public static void main(String[] args) {
        final Order order = new Order(4.00);
        System.out.println(order.hasDiscount());
    }

}
