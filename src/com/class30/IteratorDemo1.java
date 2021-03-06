package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        /*subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");*/

        System.out.println(subjects);

        Iterator<String> iterator=subjects.iterator(); //3 methods in iterator
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(subjects);
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(subjects);
        iterator=subjects.iterator();

        System.out.println(iterator.hasNext());
    //    System.out.println(iterator.next());  //will get error because there is no element after manuel testing

    }
}
