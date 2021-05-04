package com.class30.Hw;

import com.sun.javafx.collections.VetoableListDecorator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hw2 {
    public static void main(String[] args) {
      /*Create a Set of cities in which you want to make sure that insertion order is maintained.
      Then remove any city that starts with “A”;*/

        Set<String> cities = new LinkedHashSet<>();
        cities.add("Ft Washington");
        cities.add("Alexandria");
        cities.add("Miami");
        cities.add("Manhattan");
        cities.add("Arlington");
        cities.add("Los Angeles");

       // cities.removeIf(city -> city.startsWith("A"));   can remove like this as well

        Iterator<String>iterator= cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();

            if (city.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(cities);

    }
}
