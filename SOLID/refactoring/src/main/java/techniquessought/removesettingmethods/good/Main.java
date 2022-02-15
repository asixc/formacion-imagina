package techniquessought.removesettingmethods.good;
// Source: https://refactoring.guru/es/remove-setting-method
public class Main {
    final double pi = 3.14159;
    final int randomNumber = 123;
    UtilCalculator mCalculator = new UtilCalculator(pi);

    final double result = mCalculator.getPi() * randomNumber;


    final double anotherResult = getComplexCalc(); // by removing the setter we preserve the value of its instantiation


    private double getComplexCalc() {
        return mCalculator.getPi() * randomNumber;
    }


    class UtilCalculator {
        private double pi;

        public UtilCalculator(double pi) { this.pi = pi; }

        public double getPi() {
            return pi;
        }

    }
}

