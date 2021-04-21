package com.class30.Hw;

import java.util.Set;
import java.util.TreeSet;

public class Hw1 {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.*/

        Set<String> country = new TreeSet<>();
        country.add("USA");
        country.add("China");
        country.add("Canada");
        country.add("Australia");
        country.add("Egypt");

        System.out.println("----------First Way----------");
        System.out.println(country);

        System.out.println("----------Second Way----------");
        for (String countries : country) {
            System.out.println(countries);
        }
    }
}