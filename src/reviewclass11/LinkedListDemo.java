package reviewclass11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);
        numbers.add(13);
        numbers.add(110);
        numbers.add(2);
        System.out.println(numbers);
       /* int index= numbers.indexOf(110); //you can remove this way with the index location of number
       numbers.remove(index);
        System.out.println(numbers);*/
        numbers.remove(new Integer(110));  //or this way
        System.out.println(numbers);
    }
}
