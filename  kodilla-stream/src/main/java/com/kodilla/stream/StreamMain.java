package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static double add (double x, double y){
        return  x + y;
    }
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        MathExpression myCode = (x, y)-> x + y;

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, myCode);
        expressionExecutor.executeExpression(10, 5, (a, b) -> {
            System.out.println("Tu bylem");
            return a + b;
        });
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Text decoration expressions with lambdas");
        poemBeautifier.beautify("Kodilla Course", (textForDecoration) -> textForDecoration.toLowerCase() );
        poemBeautifier.beautify("Kodilla Course", (textForDecoration) -> ("ABC " + textForDecoration + " ABC"));
        poemBeautifier.beautify("Kodilla Course", (textForDecoration) -> textForDecoration.toUpperCase() );
        poemBeautifier.beautify("Kodilla Course", (textForDecoration) -> (textForDecoration.replace('o','*')));
        poemBeautifier.beautify("Kodilla Course", (textForDecoration) -> (textForDecoration.replaceAll("Course", "Bootcamp")));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("\nModul 07.3" );
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getUserCounterPosts() >= 1)
                .filter(forumUser ->
                    Period.between(forumUser.getUserDateOfBirth(), LocalDate.now()).getYears() >= 20 )
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        System.out.println("\nModul 07.4" );

        Continent europe = new Continent();

        europe.addCountry(new Country("Poland", new BigDecimal("123")));
            europe.addCountry(new Country("Germany", new BigDecimal("456")));
            europe.addCountry(new Country("France", new BigDecimal("789")));

        Continent asia = new Continent();
            asia.addCountry(new Country("Russia", new BigDecimal("987")));
            asia.addCountry(new Country("China", new BigDecimal("654")));
            asia.addCountry(new Country("India", new BigDecimal("321")));

        Continent africa = new Continent();
            africa.addCountry(new Country("Niger", new BigDecimal("147")));
            africa.addCountry(new Country("Tunisia", new BigDecimal("258")));
            africa.addCountry(new Country("Kenya", new BigDecimal("369")));

        World world = new World();
            world.addContinent(europe);
            world.addContinent(asia);
            world.addContinent(africa);

    }
}

