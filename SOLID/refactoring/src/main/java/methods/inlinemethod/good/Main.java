package methods.inlinemethod.good;

public class Main {
	
    final private static double INTEREST = 5d;

    double getRateInterest(){
        return INTEREST > 5 ? 2 : 1;
    }

}
