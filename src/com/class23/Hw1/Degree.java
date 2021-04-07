package com.class23.Hw1;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree, you need a high school diploma.");
    }
}

class Bachelors extends Degree{

}

class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree, you need a Bachelors degree.");
    }

}

class Tester{
    public static void main(String[] args) {

        Degree obj1=new Degree();
        obj1.getPrerequisite();

        Bachelors obj2=new Bachelors();
        obj2.getPrerequisite();

        Masters obj3=new Masters();
        obj3.getPrerequisite();
    }
}