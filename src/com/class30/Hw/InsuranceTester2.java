package com.class30.Hw;

import java.util.ArrayList;

public class InsuranceTester2 {
    public static void main(String[] args) {

        Car car=new Car("Geico","Tela");
        Pet pet=new Pet("Gieco","Dog");
        Health health=new Health("AAA");
        ArrayList<Insurance> arrayList=new ArrayList<>();
        arrayList.add(car);
        arrayList.add(pet);
        arrayList.add(health);

        for(Insurance insurance:arrayList){
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }

}
