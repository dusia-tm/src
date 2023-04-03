package src.noirix.util;

import src.noirix.vehicle.ElectricCar;

import java.util.Random;

public class CarGenerator {
    public static ElectricCar[] generateCars(int size) {
        ElectricCar[] array = new ElectricCar[size];

        for (int i = 0; i < array.length; i++) {

            ElectricCar electricCar = new ElectricCar();
            electricCar.setProductionYear(new Random().nextInt(2023));

            array[i] = electricCar;
        }

        return array;
    }
}
