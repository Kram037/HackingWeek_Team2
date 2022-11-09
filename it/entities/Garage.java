package HackingWeek_Team2.it.entities;

import java.util.Arrays;

public class Garage {
    //treating the class as a singleton
    private static final Garage garage = new Garage();

    private final MotorVehicle[] garageLots = new MotorVehicle[15];


    private Garage(){} //constructor method

    public static Garage getInstance(){
        return garage;
    }

    /**
     * method the use a for loop to cycle the array garageLots and an if statement to add an input parameter inside
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
     * method to remove an item inside the array using an instance of the object removed
     * @param lot number of the garage lot
     * @return removed object
     */
    public MotorVehicle removeVehicle(int lot) {
        MotorVehicle removed = garageLots[lot];
        garageLots[lot] = null;
        return removed;
    }

    /**
     * method that print garage details using a foreach to cycle the garageLots and printing the value inside but using
     * a try catch structure to avoid the NullPointerException caused from the use of the removedVehicle method and the
     * presence of null objects inside the garageLots array
     */
    public void printGarageDetails(){

        System.out.println("*** GARAGE - Max parking lot: 15 ***\n");
        for (MotorVehicle posto : garageLots) {
            try {
                System.out.println("Parking lot [" + Arrays.asList(garageLots).indexOf(posto) + "]: " + posto.getClass().getSimpleName());
                posto.info();
                System.out.println("****************************************");
            } catch (NullPointerException e) {
                System.out.println("Free parking lot");
                System.out.println("****************************************");
            }
        }
    }
}
