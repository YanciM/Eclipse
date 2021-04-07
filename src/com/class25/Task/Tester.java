package com.class25.Task;

public class Tester {

    public static void main(String[] args) {

        Student student=new SyntaxStudent();
        student.eat();
        student.sleep();
        student.study();

        SyntaxStudent syntaxStudent=(SyntaxStudent) student;
        syntaxStudent.learn();
    }

}
