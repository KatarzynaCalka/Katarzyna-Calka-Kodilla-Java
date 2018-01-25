package com.kodilla.stream.com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String textForDecoration, PoemDecorator poemDecorator) {
        String textDecorated = poemDecorator.decorate(textForDecoration);
        System.out.println(textDecorated);
        return textDecorated;
    }
}
