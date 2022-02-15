package techniquessought.methodswithlongparameterlist.bad;

public class Main {

    public static void main(String[] args) {
        final int nArticles = 1;
        final double price = 100.24;
        final String description = "Blu-ray";
        final String dataAsString = "25-12-2021";
        final String dniClient = "40080098D";
        final String companyNif = "B50040400";

        boolean result = registerPurchase(nArticles, price, description, dataAsString, dniClient, companyNif);

    }

    private static boolean registerPurchase(int nArticles, double price, String description, String dataAsString, String dniClient, String companyNif) {

        // ... does different things
        return true;
    }
}
