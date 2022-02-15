package techniquessought.methodswithlongparameterlist.good;

public class Article {
    private int nArticles = 1;
    private double price = 100.24;
    private String description = "Blu-ray";

    public Article() {
    }

    public int getnArticles() {
        return nArticles;
    }

    public void setnArticles(int nArticles) {
        this.nArticles = nArticles;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
