/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Tony
 */
public class CountWords {
    public static void main(String[] args){
        String text ="This is word counting testing to test duplicate Word";
        Stream<String> stream = Stream.of(text.toLowerCase().split("\\W+")).parallel();
        Map<String,Long> wordFreq = stream.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        //TODO pring map
        ConcurrentMap<String, Integer> m= new ConcurrentHashMap<>();
        m.compute("x", (k,v)-> v==null?1:v+1);
        //TODO print map
        
    }
}
