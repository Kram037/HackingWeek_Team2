package HackingWeek_Team2.it.entities;

import java.util.Arrays;

public class Garage {

    private static final Garage garage = new Garage();

    private final MotorVehicle[] garageLots = new MotorVehicle[15];


    private Garage(){}

    public static Garage getInstance(){
        return garage;
    }

    /**
     * method that uses a for loop to cycle the array garageLots and checks if the lot is empty to add an element
     * @param vehicle to insert in a parking lot
     */
    public void addVehicle(MotorVehicle vehicle) {

       for(int i = 0; i < garageLots.length; i++){

           if(garageLots[i] == null){
              garageLots[i] = vehicle;
              break;
          }
       }
    }

    /**
     * method to remove an item from the array returning an instance of the object itself
     * @param lot number of the garage lot
     * @return removed object
     */
    public MotorVehicle removeVehicle(int lot) {
        MotorVehicle removedVehicle = garageLots[lot];
        garageLots[lot] = null;
        return removedVehicle;
    }

    /**
     * method that cycles through the garageLots array to check, with an if else block, if the lots are empty printing
     * that the lot is empty, or there is a vehicle printing its details.
     */
    public void printGarageDetails(){

        System.out.println("*** GARAGE - Max parking lot: 15 ***\n");
        for (MotorVehicle lot : garageLots) {
            if (lot == null){
                System.out.println("Free parking lot");
                System.out.println("****************************************");
            } else {
                System.out.println("Parking lot [" + Arrays.asList(garageLots).indexOf(lot) + "]: " + lot.getClass().getSimpleName());
                lot.info();
                System.out.println("****************************************");
            }
        }

    }
}
