package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        String result = null;

        try {
            result= secondChallenge.probablyIWillThrowException(1.0, 5.5);
        }
        catch (Exception e) {
            System.out.println("Problem with argument \"x\" or \"y\". Error: " + e);
            result = "Done with exception.";
        }
        finally {
            System.out.println(result);
        }
    }
}
