package conditionals.polymorphism.good;

public class Main {
      public static void main(String[] args) {
        final Product productBasic = new ProductSimple(5.00);
        double basicPrice = productBasic.calculatePrice();
        System.out.println("Basic price:" + basicPrice);

        final Product productPremium = new ProductPremium(100.0);
        double premiumPrice = productPremium.calculatePrice();
          System.out.println("Premium price:" + premiumPrice);

        final Product productMedium = new ProductMedium(10.0);
        double mediumPrice = productMedium.calculatePrice();
          System.out.println("Medium price:" + mediumPrice);
    }
}
