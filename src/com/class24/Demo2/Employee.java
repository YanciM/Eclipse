package com.class24.Demo2;

public class Employee {

    double salary;

    void work(){
        System.out.println("Empoyee is working");
    }

    void getPaid(){
        System.out.println("Employee is getting paid "+salary+" other benefits");
    }

    void goOnLeave(){
        System.out.println("Employee is going on leave");
    }
}

class FullTimeEmp extends Employee{

}

class PartTimeEmp extends Employee{
    @Override
    void goOnLeave(){
        System.out.println("Part time employee don't get leaves");
    }
}

class Contractor extends Employee{
    @Override
    void goOnLeave(){
        System.out.println("Contractor employee don't get leaves");
    }

    @Override
    void getPaid(){
        System.out.println("Paid hourly basis");
    }
}
