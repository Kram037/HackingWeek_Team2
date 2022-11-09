package HackingWeek_Team2;

import HackingWeek_Team2.it.entities.*;

public class Main {
    public static void main(String[] args) {

        Garage garage = Garage.getInstance();

        MotorVehicle auto = new Car("FIAT", 1998, 6, 4, "diesel");
        MotorVehicle moto = new Motorcycle("ducati", 2000, 4, 9);
        MotorVehicle furgone = new Van("MAN", 2022, 10, 1500.6);
        MotorVehicle auto1 = new Car("Audi", 1998, 6, 4, "diesel");
        MotorVehicle furgone1 = new Van("Mercedes", 2022, 10, 1500.6);

        garage.aggiungiVeicolo(auto);
        garage.aggiungiVeicolo(moto);
        garage.aggiungiVeicolo(furgone);
        garage.aggiungiVeicolo(auto1);
        garage.aggiungiVeicolo(furgone1);
        garage.removeVehicle(1);

        garage.printGarageDetails();

    }
}