package it.entities;

public abstract class MotorVehicle {

    private String brand;
    private int year;
    private double displacement;

    public MotorVehicle(String brand, int year, double displacement) {
        this.brand = brand;
        this.year = year;
        this.displacement = displacement;
    }
    //getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * info method that prints vehicle details, overridden in the classes that extend MotorVehicle
     */
    public void info(){
        System.out.print(brand + " - production year: " + year + " - displacement: " + displacement);
    }
}
