/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning.listSorting;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Tony
 */
public class MovieSortingTest {
    private final List<Movie> movies = Arrays.asList(
            new Movie("Lord of rings"),
            new Movie("Back to future"),
            new Movie("Carlito's way"),
            new Movie("Pulp fiction")
    );
    
    @Test
    public void sortByMovieName(){
        MovieSorting.sortByMovieName(movies);
        assertEquals("Back to future", movies.get(0).getName());
    }
    
    private final List<Movie> movies2 = Arrays.asList(
            new Movie("Lord of rings", 8.8),
            new Movie("Back to future", 8.5),
            new Movie("Carlito's way", 7.9),
            new Movie("Pulp fiction", 8.9)
    );
    
    @Test
    public void sortByMovieRate(){
        MovieSorting.sortByMovieRate(movies2);
        assertEquals("Carlito's way", movies2.get(0).getName());
    }
    
    @Test
    public void sortByRateReverse(){
        MovieSorting.sortByMovieRateReverse(movies2);
        assertEquals("Pulp fiction", movies2.get(0).getName());
    }
    private final List<Movie> movies3 = Arrays.asList(
            new Movie("Lord of rings", 8.8, true),
            new Movie("Back to future", 8.5, false),
            new Movie("Carlito's way", 7.9, true),
            new Movie("Pulp fiction", 8.9, false)
    );
    @Test
    public void sortByStarredAnonymusComparator(){
        MovieSorting.sortByStarredAnonymusComparator(movies3);
        assertEquals("Lord of rings", movies2.get(0).getName());
    }
    
    @Test
    public void sortByStarredLambdaComparator(){
        MovieSorting.sortByStarredLambdaComparator(movies3);
        assertEquals("Lord of rings", movies2.get(0).getName());
    }
    @Test
    public void sortByStarredComparatorComparing(){
        MovieSorting.sortByStarredComparatorComparing(movies3);
        assertEquals("Lord of rings", movies2.get(0).getName());
    }
    @Test
    public void sortByStarredComparatorThenByRate(){
        MovieSorting.sortByStarredComparatorThenByRate(movies3);
        assertEquals("Lord of rings", movies2.get(0).getName());
    }
}
