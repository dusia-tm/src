package src.noirix.vehicle;

import java.io.Serializable;
import java.util.Objects;

public class ElectricCar extends Car implements Cloneable, Serializable, Comparable<ElectricCar> /*Comparator<ElectricCar>*/ {

    private String carId;

    private int doors;

    private int productionYear;

    private int wheels;

    private double engineVolume;


    public ElectricCar() {

    }

    public ElectricCar(String carId, int doors, int productionYear, int wheels, double engineVolume) {
        this.carId = carId;
        this.doors = doors;
        this.productionYear = productionYear;
        this.wheels = wheels;
        this.engineVolume = engineVolume;
    }

    //Getters/Setters
    //Alt+Insert
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void recharge() {

    }

    public void someFuncElectricCar() {
        System.out.println("Hello!");
    }

    @Override
    public void openRoof() {

    }

    @Override
    public void closeRoof() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricCar that = (ElectricCar) o;

        if (doors != that.doors) return false;
        if (productionYear != that.productionYear) return false;
        if (wheels != that.wheels) return false;
        if (Double.compare(that.engineVolume, engineVolume) != 0) return false;
        return Objects.equals(carId, that.carId);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carId != null ? carId.hashCode() : 0;
        result = 31 * result + doors;
        result = 31 * result + productionYear;
        result = 31 * result + wheels;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carId='" + carId + '\'' +
                ", doors=" + doors +
                ", productionYear=" + productionYear +
                ", wheels=" + wheels +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }

    @Override
    public int compareTo(ElectricCar o) {

        if (this.productionYear < o.getProductionYear()) {
            return -1;
        } else {
            if(this.productionYear == o.getProductionYear()) {
                return 0;
            } else {
                return 1;
            }
        }

        //return Integer.compare(this.productionYear, o.getProductionYear());
    }
}
