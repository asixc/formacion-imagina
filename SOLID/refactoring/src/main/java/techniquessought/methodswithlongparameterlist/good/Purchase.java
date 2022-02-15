package techniquessought.methodswithlongparameterlist.good;

public class Purchase {

    private Article article;
    private String dataAsString = "25-12-2021";
    private String dniClient = "40080098D";
    private String companyNif = "B50040400";

    public Purchase() {}

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getDataAsString() {
        return dataAsString;
    }

    public void setDataAsString(String dataAsString) {
        this.dataAsString = dataAsString;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public String getCompanyNif() {
        return companyNif;
    }

    public void setCompanyNif(String companyNif) {
        this.companyNif = companyNif;
    }
}
