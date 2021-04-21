package com.class30.Hw;

import java.util.HashSet;
import java.util.Set;

public class Student {
      /*Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID. Display name of each student.*/
        String name;
        String studentID;

        Student(String name, String studentID){
            this.name=name;
            this.studentID=studentID;

        }
        @Override
    public String toString() {
        return name+" "+studentID;
    }
}
class Hw3{
    public static void main(String[] args) {

        Student student1=new Student("Kaylee","A123");
        Student student2=new Student("Jace","B123");
        Student student3=new Student("Mike","C123");
        Student student4=new Student("Emely","D123");
        Student student5=new Student("John","E123");

        Set<Student> student=new HashSet<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        System.out.print(student);


    }

}
