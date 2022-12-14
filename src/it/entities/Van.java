package it.entities;

public class Van extends MotorVehicle {

    private double capacity;

    public Van(String brand, int year, double displacement, double capacity) {
        super(brand, year, displacement);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String info() {
       return super.info() + " - capacity: " + capacity;
    }
}
