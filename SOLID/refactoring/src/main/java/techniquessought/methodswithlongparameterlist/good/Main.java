package techniquessought.methodswithlongparameterlist.good;
// Source: https://refactoring.guru/es/smells/long-parameter-list
public class Main {

    public static void main(String[] args) {

        final Article article = giveArticle(1, 100.24, "Blu-ray");
        final Purchase purchase = generatePurchase(article);

        boolean result = registerPurchase(purchase);

    }

    private static Purchase generatePurchase(Article article) {
        Purchase purchase = new Purchase();
        purchase.setArticle(article);
        purchase.setCompanyNif("B50040400");
        purchase.setDataAsString( "25-12-2021");
        purchase.setDniClient("40080098D");
        return purchase;
    }

    private static Article giveArticle(int nArticles,double cost, String description) {
        Article article = new Article();
        article.setnArticles(nArticles);
        article.setPrice(100.24);
        article.setDescription("Blu-ray");
        return article;
    }

    private static boolean registerPurchase(Purchase purchase) {

        // ... does different things
        return true;
    }
}
