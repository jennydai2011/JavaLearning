/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning;

import java.util.stream.IntStream;

/**
 *
 * @author Tony
 */
public class Java8Learning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));

    }

    private static boolean isPrime(final int number) {
//        for(int i=2; i< number; i++){
//            if(number %i==0) return false;
//        }
//        
//        return number >1;

        return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 1);
    }

}
