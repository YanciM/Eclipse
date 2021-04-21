package com.class30.Hw;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(new Car("Allstate","Honda"));
        insurance.add(new Pet("ASPCA","American Bull Dog"));
        insurance.add(new Health("Blue Cross"));

        System.out.println("------First Way------");
        for(Insurance insurance1:insurance){
            insurance1.getQuote();
            insurance1.cancelInsurance();
        }

        System.out.println("------Second Way------");

        for(int i=0; i<insurance.size(); i++){
            insurance.get(i).getQuote();
            insurance.get(i).cancelInsurance();
        }

        System.out.println("------Third Way------");

        Iterator<Insurance> insurance3=insurance.iterator();
        while (insurance3.hasNext()){
            Insurance insu=insurance3.next();
            insu.getQuote();
            insu.cancelInsurance();
        }
    }
}
