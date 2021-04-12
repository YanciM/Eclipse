package com.class27.Demo1;

import com.class27.Demo1.Iphone;
import com.class27.Demo1.Phone;
import com.class27.Demo1.Samsung;

public class PhoneTester {

    public static void main(String[] args) {

        Phone iphone=new Iphone();
        iphone.unlockPhone();

        Phone samsungPhone=new Samsung();
        samsungPhone.displayPictures();
        samsungPhone.makeCalls();

       // Phone phone=new Phone(); WE ARE NOT ALLOWED TO CREAT AN OBJECT BECAUSE CLASS IN NOT COMPLETE

    }

}
