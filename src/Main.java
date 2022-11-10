import it.entities.*;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        boolean isRunning = true;
        Garage garage = Garage.getInstance();
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        //.useLocale(Locale.US) used to insert double with a dot and not a comma

        while(isRunning){

            System.out.println("Select an option:\n" +
                    "Add vehicle: input car, bike or van\n" +
                    "Remove vehicle: input remove\n" +
                    "Info garage: input info\n" +
                    "Close garage: input close");
            switch (scan.nextLine().trim().toLowerCase()){
                case "car":
                    System.out.println("Insert brand, year, displacement, fuel type and number of doors");
                    MotorVehicle car = new Car(scan.nextLine(), Integer.parseInt(scan.nextLine()), Double.parseDouble(scan.nextLine()), scan.nextLine(), Integer.parseInt(scan.nextLine()));
                    garage.addVehicle(car);
                    break;
                case "bike":
                    System.out.println("Insert brand, year, displacement and engine time");
                    MotorVehicle motorCycle = new Motorcycle(scan.nextLine(), Integer.parseInt(scan.nextLine()), Double.parseDouble(scan.nextLine()), Integer.parseInt(scan.nextLine()));
                    garage.addVehicle(motorCycle);
                    break;
                case "van":
                    System.out.println("Insert brand, year, displacement and capacity");
                    MotorVehicle van = new Van(scan.nextLine(), Integer.parseInt(scan.nextLine()), Double.parseDouble(scan.nextLine()), Double.parseDouble(scan.nextLine()));
                    garage.addVehicle(van);
                    break;
                case "remove":
                    System.out.println("Which lot do you want to free?");
                    garage.removeVehicle(Integer.parseInt(scan.nextLine()));
                    System.out.println("Vehicle removed");
                    break;
                case "info":
                    garage.printGarageDetails();
                    break;
                case "close":
                    System.out.println("Closing the garage");
                    isRunning = false;
                    break;
                default:
                    System.out.println("!!!Input not accepted!!!\n");
                    break;
            }

        }

    }
}