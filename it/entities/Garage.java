package HackingWeek_Team2.it.entities;

import java.util.Arrays;

public class Garage {

    private static final Garage garage = new Garage();

    private MotorVehicle[] postiGarage = new MotorVehicle[15];


    private Garage(){}

    public static Garage getInstance(){
        return garage;
    }

    public void aggiungiVeicolo(MotorVehicle veicolo) {

       for(int i = 0; i < postiGarage.length; i++){

          if(postiGarage[i] == null){
              postiGarage[i] = veicolo;
              break;
          }

       }

    }

    public MotorVehicle removeVehicle(int posto) {
        MotorVehicle temp = postiGarage[posto];
        postiGarage[posto] = null;
        return temp;
    }

    public void printGarageDetails(){

        System.out.println("*** GARAGE - Max parking lot: 15 ***\n");
        for (MotorVehicle posto : postiGarage) {
            try {
                System.out.println("Parking lot [" + Arrays.asList(postiGarage).indexOf(posto) + "]: " + posto.getClass().getSimpleName());
                posto.info();
                System.out.println("****************************************");
            } catch (NullPointerException e) {
                System.out.println("Free parking lot");
                System.out.println("****************************************");
            }
        }

    }

}
