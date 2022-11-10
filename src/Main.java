import HackingWeek_Team2.it.entities.*;

public class Main {
    public static void main(String[] args) {

        Garage garage = Garage.getInstance();

        MotorVehicle car = new Car("FIAT", 1998, 6, 4, "diesel");
        MotorVehicle motorcycle = new Motorcycle("ducati", 2000, 4, 9);
        MotorVehicle van = new Van("MAN", 2022, 10, 1500.6);
        MotorVehicle car1 = new Car("Audi", 1998, 6, 4, "diesel");
        MotorVehicle van1 = new Van("Mercedes", 2022, 10, 1500.6);

        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        garage.addVehicle(van);
        garage.addVehicle(car1);
        garage.addVehicle(van1);
        garage.removeVehicle(1);

        garage.printGarageDetails();

    }
}