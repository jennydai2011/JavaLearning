/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning.listSorting;

/**
 *
 * @author Tony
 */
public class Movie {
    private String name;
    private double rate;
    private boolean starred;

    Movie(String name) {
       this.name = name;
    }

    Movie(String name, double rate) {
        this(name);
        this.rate = rate ;
    }

    Movie(String name, double rate, boolean starred) {
        this(name, rate);
        this.starred = starred;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", rate=" + rate + ", starred=" + starred + '}';
    }
    
}
