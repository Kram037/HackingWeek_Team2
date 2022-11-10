package it.entities;

public class Car extends MotorVehicle {

    private int doors;
    private String fuel; //diesel - benzina

    public Car(String brand, int year, double displacement, int doors, String fuel) {
        super(brand, year, displacement);
        this.doors = doors;
        this.fuel = fuel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String info() {
        return super.info() + doors + " doors - fuel type: " + fuel;
    }
}

