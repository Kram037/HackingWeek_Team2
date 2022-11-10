package it.entities;

import java.util.Arrays;

public class Garage {
    
    private static final Garage garage = new Garage();

    private final MotorVehicle[] garageLots = new MotorVehicle[15];


    private Garage(){} 

    public static Garage getInstance(){
        return garage;
    }

    /**
     * method that uses a for loop to cycle the array garageLots and check every lot to find the first empty lot 
     * to add an element.
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
     * method to remove an item from the array returning an instance of the object itself.
     * @param lot number of the garage lot
     * @return removed object
     */
    public MotorVehicle removeVehicle(int lot) {

        MotorVehicle removedVehicle = null;

        try {
            removedVehicle = garageLots[lot];
            if (garageLots[lot] == null) {
                System.out.println("The parking lot " + lot + " is already free.\n");
            } else {
                garageLots[lot] = null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The parking lot doesn't exist. Choose another one.\n");
        } finally {
            return removedVehicle;
        }

    }

    /**
     * method that cycles through the garageLots array to check, with an if else block, if the lots are free printing
     * that the lot is free, or there is a vehicle printing its details.
     *
     * lotNum is a temporary variable just for graphic purposes.
     */
    public void printGarageDetails(){

        System.out.println("*** GARAGE - Max parking lot: 15 ***\n");
        int lotNum = 0;
        for (MotorVehicle lot : garageLots) {
            if (lot == null){
                System.out.println("Parking lot [" + lotNum + "] free.");
                System.out.println("****************************************");
                lotNum++;
            } else {
                System.out.println("Parking lot [" + Arrays.asList(garageLots).indexOf(lot) + "]: " + lot.getClass().getSimpleName());
                lot.info();
                System.out.println("****************************************");
                lotNum++;
            }
        }
    }
}