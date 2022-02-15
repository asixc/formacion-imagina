package lsp.bad;

public class Main {

    public static void main(String[] args) {

        String carType = "electric";

        // este codigo seria el ideal a ejecutar
//        Vehicle combusion = new CombustionCar();
//        Vehicle electric = new ElectricCar();
//        combusion.accelerate();
//        electric.accelerate();
        
        
        
        if ("car" == carType) {
            CombustionCar car = new CombustionCar();
            car.accelerate();
        } else if ("electric" == carType) {
        	ElectricCar electricCar = new ElectricCar();
            if ((electricCar.hasBattery())) { // Al trabajar con una clase específica tenemos que hacer comprobaciones extra para acelerar
                electricCar.accelerate();
            }
//            Vehicle electricCar = new ElectricCar();
//            electricCar.accelerate(); // no podemos ejecutar esto directamente porque nos estariamos saltando la comprobacion de la bateria
        }else{
            throw new RuntimeException("Invalid car");
        }
    }
    
}
