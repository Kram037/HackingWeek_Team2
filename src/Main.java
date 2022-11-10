import it.entities.*;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Garage garage = Garage.getInstance();
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while(true){

            System.out.println("Select an option:\n" +
                    "Add vehicle: insert car, motorcycle or van\n" +
                    "Remove vehicle: insert remove\n" +
                    "Close garage: close\n");
            switch (scan.nextLine().trim().toLowerCase()){
                case "car":
                    System.out.println("Insert brand, year, displacement, fuel type and number of doors");
                    MotorVehicle car = new Car(scan.nextLine(), scan.nextInt(), scan.nextDouble(), scan.nextLine(), scan.nextInt());
                    garage.addVehicle(car);
                break;
                case "motorcycle":
                    System.out.println("Insert brand, year, displacement and engine time");
                    MotorVehicle motorCycle = new Motorcycle(scan.nextLine(), scan.nextInt(), scan.nextDouble(), scan.nextInt());
                    garage.addVehicle(motorCycle);
                break;
                case "van":
                    System.out.println("Insert brand, year, displacement and capacity");
                    MotorVehicle van = new Van(scan.nextLine(), scan.nextInt(), scan.nextDouble(), scan.nextDouble());
                    garage.addVehicle(van);
                break;
                case "remove":
                    System.out.println("Which lot do you want to free?");
                    garage.removeVehicle(scan.nextInt());
                    break;
                case "close":
                    System.out.println("Closing the garage");
                    scan.close();
                    break;
                default:
                    System.out.println("Vehicle not accepted");
            }

            garage.printGarageDetails();
        }






        // while per iniziare il programma -> switch per scegliere il tipo -> istanza dell'oggetto con scanner al posto dei parametri
    }
}