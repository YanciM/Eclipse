package com.class19;

public class Employee {

    private String name;
    private String emId;
    private double salary;
    private String department;

    public Employee(String name, String emId, double salary, String department) {
        this.name = validateName(name);
        this.emId = emId;
        this.salary = salary;
        this.department = department;
    }

    void printInfo() {
        System.out.println("Name" + name + "Employee ID" + emId);


    }

    String validateName(String name) {
        if (name.length() < 15) {
            return name;

        } else {
            return null;
        }
    }
}
