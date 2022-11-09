package HackingWeek_Team2;

import HackingWeek_Team2.it.entities.*;

public class Main {
    public static void main(String[] args) {

        Garage garage = Garage.getInstance();

        VeicoloAMotore auto = new Auto("FIAT", 1998, 6, 4, "diesel");
        VeicoloAMotore moto = new Moto("ducati", 2000, 4, 9);
        VeicoloAMotore furgone = new Furgone("MAN", 2022, 10, 1500.6);
        VeicoloAMotore auto1 = new Auto("Audi", 1998, 6, 4, "diesel");

        garage.aggiungiVeicolo(auto);
        garage.aggiungiVeicolo(moto);
        garage.aggiungiVeicolo(furgone);
        garage.aggiungiVeicolo(auto1);
        garage.removeVehicle(1);

        garage.printGarageDetails();

    }
}