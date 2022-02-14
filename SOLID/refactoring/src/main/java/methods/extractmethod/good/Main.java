package methods.extractmethod.good;

public class Main {

    void printHTML(){
        
        printHead();
        printBody();
        
    }

    private void printBody() {
        System.out.println("This is the footer");
        System.out.println("script");
    }

    private void printHead() {
        System.out.println("copyright");
        System.out.println("");
    }
}
