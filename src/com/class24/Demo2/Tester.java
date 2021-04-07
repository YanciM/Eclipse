package com.class24.Demo2;

import java.util.concurrent.Callable;

public class Tester {

    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.salary=10000;
        employee.getPaid();

        Contractor contractor=new Contractor();
        contractor.salary=50;
        contractor.getPaid();

        //widening
        double var1=10;
        System.out.println(var1);

        int var2= (int)10.5;
        //widening upcasting
        Employee contractor2=new Contractor();
        //narrowing down casting
        Contractor contractor3=(Contractor) new Employee();
    }
}
