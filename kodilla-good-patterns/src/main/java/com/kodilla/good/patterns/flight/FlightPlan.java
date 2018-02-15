package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightPlan {

    private List<Flight> listFlights;

    public FlightPlan(){
        listFlights = new ArrayList<>();
        listFlights.add(new Flight("WAW", "GDN"));
        listFlights.add(new Flight("WMI", "KRK"));
        listFlights.add(new Flight("KRK", "GDN"));
        listFlights.add(new Flight("GDN", "WMI"));
        listFlights.add(new Flight("GDN", "WAW"));
        listFlights.add(new Flight("KRK", "WAW"));
        listFlights.add(new Flight("WRO", "WMI"));
    }

    public List<Flight> getListFlights() {
        return listFlights;
    }
}
