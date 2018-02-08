package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("KrakowBalice", true);
        airports.put("WarszawaOkecie", true);
        airports.put("Modlin", false);
        airports.put("KatowicePyrzowice", true);
        airports.put("Wroclaw", false);

       // for (Map.Entry<String, Boolean> entry : airports.entrySet()) {



        /*if (airports.containsKey(key){
            System.out.println("The airport is available.");
        }
        else {
            System.out.println("The airport is unavailable.");
        }
        throw new RouteNotFoundException("The airport does not exist.");*/
    }
}
