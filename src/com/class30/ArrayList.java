package com.class30;

import java.util.List;
import java.util.ListIterator;

public class ArrayList {
    public static void main(String[] args) {

        List<String> cities=new java.util.ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");

        ListIterator<String> stringListIterator= cities.listIterator();
        System.out.println(stringListIterator.next());
        System.out.println(stringListIterator.previous());

    }
}
