import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GoodPatternsMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String theResult = movieStore.getMovies().values().stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.joining("!", "", ""));

        System.out.println(theResult);
    }
}
