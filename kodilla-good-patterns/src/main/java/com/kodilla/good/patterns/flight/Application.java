package com.kodilla.good.patterns.flight;

public class Application {

    public static void main(String[] args){

        FindFlight findFlight = new FindFlight();
        System.out.println(findFlight.findDeparturesAirport("KRK"));
        System.out.println(findFlight.findArrivalAirport("GDN"));
        System.out.println(findFlight.findIndirectFlight("KRK", "WAW", "GDN"));
    }
}
