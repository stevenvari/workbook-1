package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Select a date to pickup the car: ");
        String pickUp = keyboard.nextLine();
        System.out.println("Pickup day is: "+ pickUp);

        System.out.println("How many days do you want to rent the car it cost 29.99 per day : ");
        String daysOfRentalCar = keyboard.nextLine();
        System.out.println("Days of rental are: " + daysOfRentalCar);

        System.out.println("Do you want an electronic toll tag at $3.95 per day: say yes or no ");
        String electronicTollTag = keyboard.nextLine();
        System.out.println("Electronic toll tag: " + electronicTollTag);

        System.out.println("Do you want a GPS for $3.95 per day: say yes or no");
        String gpsOption = keyboard.nextLine();
        System.out.println("Do you choose GPS: " + gpsOption);

        System.out.println("Do you want a roadside assistance for $3.95 per day: yes or no ");
        String roadSideAssistance = keyboard.nextLine();
        System.out.println("Did you choose road assistance: " + roadSideAssistance);

        System.out.println("what is your current age:");
        int theAge = keyboard.nextInt();
        System.out.println("the current age is: " + theAge);


        double electronicOption = 3.95;
        double gpsUse = 2.95;
        double addRoadside = 3.95;
        double costPerDay = 29.99;


        double underAgeDriverSurcharge = 0.0;
        if (theAge <= 25){
            underAgeDriverSurcharge = 0.30;
        } else if (theAge > 26) {

        }

        double finalPrice = costPerDay + (costPerDay + underAgeDriverSurcharge + electronicOption + gpsUse + addRoadside);
        System.out.println("Total price is: "+ finalPrice);



    }
}
