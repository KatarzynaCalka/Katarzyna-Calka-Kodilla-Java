package com.kodilla.good.patterns.flight;

import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    private FlightPlan flightPlan = new FlightPlan();

    public List<Flight> findDeparturesAirport(String departureAirport) {
        System.out.println("\nList of available flights from: " + departureAirport);
        List<Flight> listDeparturesAirport = flightPlan.getListFlights().stream()
                .filter(l -> l.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
        return listDeparturesAirport;
    }

    public List<Flight> findArrivalAirport(String arrivalAirport) {
        System.out.println("\nList of available flights to: " + arrivalAirport);
        List<Flight> listArrivalAirport = flightPlan.getListFlights().stream()
                .filter(l -> l.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
        return listArrivalAirport;
    }

    public List<Flight> findIndirectFlight(String departureAirport, String viaAirport, String arrivalAirport) {
        System.out.println("\nList of available flights from: " + departureAirport + " via " + viaAirport + " to " + arrivalAirport);

        List<Flight> listIndirectArrivalAirport = flightPlan.getListFlights().stream()
                .filter(l -> l.getDepartureAirport().equals(departureAirport))
                .filter(l -> l.getArrivalAirport().equals(viaAirport))
                .collect(Collectors.toList());

        List<Flight> listIndirectDepartureAirport = flightPlan.getListFlights().stream()
                .filter(l -> l.getDepartureAirport().equals(viaAirport))
                .filter(l -> l.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        listIndirectArrivalAirport.addAll(listIndirectDepartureAirport);
        return listIndirectArrivalAirport;
    }
}
