/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning.listSorting;

import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;

/**
 *
 * @author Tony
 */
class MovieSorting {

    static void sortByMovieName(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getName));
        movies.forEach(System.out::println);
    }

    static void sortByMovieRate(List<Movie> movies2) {
        movies2.sort(Comparator.comparing(Movie::getRate));
        movies2.forEach(System.out::println);
    }

    static void sortByMovieRateReverse(List<Movie> movies2) {
        movies2.sort(Comparator.comparing(Movie::getRate).reversed());
        movies2.forEach(System.out::println);
    }

    static void sortByStarredAnonymusComparator(List<Movie> movies3) {
        movies3.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                if (m1.isStarred() == m2.isStarred()) {
                    return 0;
                }
                return m1.isStarred() ? -1 : 1;
            }
        });

        movies3.forEach(System.out::println);
    }

    static void sortByStarredLambdaComparator(List<Movie> movies3) {
        movies3.sort((m1, m2) -> {
            if (m1.isStarred() == m2.isStarred()) {
                return 0;
            }
            return m1.isStarred() ? -1 : 1;
        });
        movies3.forEach(System.out::println);
    }

    static void sortByStarredComparatorComparing(List<Movie> movies3) {
        movies3.sort(
                Comparator.comparing(
                        Movie::isStarred,
                        (star1, star2) -> {
                            if (star1 == star2) {
                                return 0;
                            }
                            return star1 ? -1 : 1;
                        }
                ));
        movies3.forEach(System.out::println);
    }

    static void sortByStarredComparatorThenByRate(List<Movie> movies3) {
        movies3.sort(Comparator.comparing(Movie::isStarred)
                                .reversed()
                                .thenComparing(Movie::getRate)
                                .reversed()
        );
        movies3.forEach(System.out::println);
    }

}
