/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning.listSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Tony
 */
public class ListSortingTest {
    private final List<String> cities = Arrays.asList(
            "Milan",
            "london",
            "San Francisco",
            "Tokyo",
            "Beijing"
    );
    
    @Test
    public void insensitiveSorting(){
        System.out.println("original order:"+cities);
        
        cities.sort(String.CASE_INSENSITIVE_ORDER);        
        System.out.println("insensitive sorting:"+cities);
        
        cities.sort(Comparator.naturalOrder());
        System.out.println("natural order sorting:"+cities);
    }
    
    private final List<Integer> numbers = Arrays.asList(6,2,1,4,9);
    
    @Test
    public void integerListSorting(){
        System.out.println("original number list:"+numbers);
        
        numbers.sort(Comparator.naturalOrder());
        System.out.println("sorted number list:"+numbers);
    }
    
   
    
}
