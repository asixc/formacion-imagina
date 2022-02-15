package techniquessought.removesettingmethods.bad;

public class Main {
    final double pi = 3.14159;
    final int randomNumber = 123;
    UtilCalculator mCalculator = new UtilCalculator(pi);

    final double result = mCalculator.getPi() * randomNumber;


    final double anotherResult = getComplexCalcul(); // for some error pi is modify;


    private double getComplexCalcul() {
        mCalculator.setPi(10.0);
        return mCalculator.getPi() * randomNumber;
    }


    class UtilCalculator {
        private double pi;

        public UtilCalculator(double pi) { this.pi = pi; }

        public double getPi() {
            return pi;
        }

        public void setPi(double pi) {
            this.pi = pi;
        }
    }
}

