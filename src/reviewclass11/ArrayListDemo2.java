package reviewclass11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        List<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        int index=cities.indexOf("Virginia");
        cities.add(index+1,"New York"); //adds variable new york after virginia
        cities.add(0,"Alexandria");  //adds variable at index specified
        cities.add(0,"Lahore");


        System.out.println(cities);
        System.out.println(cities.size());
       // System.out.println(cities.contains("Virginia"));
        //System.out.println(cities.isEmpty());
        System.out.println(cities.indexOf("Chicago"));
        System.out.println(cities.lastIndexOf("Chicago"));
        System.out.println(cities.set(0,"Chicago")); //replacing index 0 with chicago
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove(4));
        System.out.println(cities);
       /* int firstIndex=2;
        int lastIndex=3;
        System.out.println(cities.subList(firstIndex,lastIndex));*/
        ArrayList<String> limitedCities=new ArrayList<>();
        System.out.println(limitedCities.getClass());
        System.out.println(cities.subList(0,1).getClass());
        System.out.println(cities);




    }
}
