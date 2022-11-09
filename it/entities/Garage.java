package HackingWeek_Team2.it.entities;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private static final Garage garage = new Garage();

    private List<VeicoloAMotore> postiGarage = new ArrayList<>();

    private Garage(){}

    public static Garage getInstance(){
        return garage;
    }

    public void aggiungiVeicolo(VeicoloAMotore veicolo){
        if(postiGarage.size() < 15) {
            postiGarage.add(veicolo);
        } else {
            System.out.println("Il garage è pieno!");
        }
    }

    public VeicoloAMotore removeVehicle(int posto){
        postiGarage.remove(posto);
        return postiGarage.get(posto);
    }

    public void printGarageDetails(){
        System.out.println(postiGarage.toString());

        postiGarage.stream().forEach(details -> {

            System.out.println(details.getClass().getSimpleName() + " posto: " + postiGarage.indexOf(details));
            details.info();
        });
    }

}
