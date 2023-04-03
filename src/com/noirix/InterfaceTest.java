package src.noirix;

import src.noirix.util.CarGenerator;
import src.noirix.vehicle.CabrioInstructions;
import src.noirix.vehicle.ElectricCar;

import java.util.Arrays;

public class InterfaceTest {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.someFuncElectricCar();

        System.out.println(electricCar.getCarId());
        System.out.println(electricCar.getDoors());
        System.out.println(electricCar.getProductionYear());
        System.out.println(electricCar);

        electricCar.setCarId("S");
        electricCar.setDoors(5);
        electricCar.setEngineVolume(3.8);
        System.out.println(electricCar);


        ElectricCar[] electricCars = CarGenerator.generateCars(10);

        for (ElectricCar car : electricCars) {
            System.out.println(car);
        }

        Arrays.sort(electricCars);

        for (ElectricCar car : electricCars) {
            System.out.println(car);
        }


        for (CabrioInstructions car : electricCars) {
            car.openRoof();
        }

//        Car car = new ElectricCar();
//        //car.someFuncElectricCar();
//
//        MechanismInstructions carInterface = electricCar;
//        carInterface.go();
//        carInterface.stop();
//        carInterface.recharge();
//
//        CabrioInstructions cabrio = electricCar;
//        cabrio.closeRoof();
//        cabrio.openRoof();
        //carInterface.someFuncElectricCar();

        //new MechanismInstructions();
    }
}
