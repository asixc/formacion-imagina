package lsp.good;

public class Main {

    public static void main(String[] args) {

        // este codigo seria el ideal a ejecutar
        Vehicle combusion = new CombustionCar();
        Vehicle electric = new ElectricCar();
        combusion.accelerate();
        electric.accelerate();

    }
    
}
