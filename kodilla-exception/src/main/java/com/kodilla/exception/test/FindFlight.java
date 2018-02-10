package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("KrakowBalice", true);
        airports.put("WarszawaOkecie", true);
        airports.put("Modlin", false);
        airports.put("KatowicePyrzowice", true);
        airports.put("Wroclaw", false);

        Boolean arrivalAirportIsOpen = airports.get(flight.getArrivalAirport());

        if (arrivalAirportIsOpen == null) {
            throw new RouteNotFoundException(flight);
        }
        return arrivalAirportIsOpen;
    }
}




