package com.kodilla.exception.test;

import java.util.HashMap;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Flight theFlight = new Flight("Modlin","Tarnow");
        FindFlight finder = new FindFlight();

        try {
           finder.findFlight(theFlight);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Processing other logic!");
    }
}
