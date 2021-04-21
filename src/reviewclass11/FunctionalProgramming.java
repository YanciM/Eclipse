package reviewclass11;

import sun.awt.HKSCS;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");

    /*    cities.removeIf(city->cities.contains("M"));
        System.out.println(cities);*/

        System.out.println("-----------------------------------------");
       /* int counter=0;
        for(String city:cities){
            if(city.contains("M")){
                counter++;
            }
        }
        System.out.println(counter);*/


        System.out.println(cities.stream().filter(city->city.contains("M")).count());

    }
}
