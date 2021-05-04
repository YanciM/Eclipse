package HomePractice;

import com.sun.javafx.collections.VetoableListDecorator;

import java.util.ArrayList;
import java.util.Iterator;

public class repel189 {
    public static void main(String[] args) {

        ArrayList<Integer> num=new ArrayList<>();

        for(int i=50; i<=100;i++){
            num.add(i);
        }

        Iterator<Integer> iterator = num.iterator();

        while(iterator.hasNext()) {
            Integer next = iterator.next();

            if (next % 3 != 0) {
                iterator.remove();
            }

        }
        System.out.println(num);


    }

}