package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }

        System.out.println("Testing class calculator:");

        Calculator calculator = new Calculator (4, 1);
        int resultA = calculator.getA();
        int resultB = calculator.getB();
        int resultAdd = calculator.add();
        int resultSubtract = calculator.subtract();

        if (resultA == 4){
            System.out.println("test \"a\" OK");
        }
        else {
            System.out.println("Error!");
        }

        if (resultB == 1){
            System.out.println("test \"b\" OK");
        }
        else {
            System.out.println("Error!");
        }

        if (resultAdd == 5){
            System.out.println("test \"a+b\" OK");
        }
        else {
            System.out.println("Error!");
        }

        if (resultSubtract == 3){
            System.out.println("test \"a-b\" OK");
        }
        else {
            System.out.println("Error!");
        }
    }
}
