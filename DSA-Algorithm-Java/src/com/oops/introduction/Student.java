package com.oops.introduction;

public class Student {
    String name;
    String roll;
    int marks;


    int mark = 12;

    void greeting(){
        System.out.println("Hello! My name is "+this.name);
    }

    //Construction Overloading
    public Student(String name, String roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    public Student() {
        //calling constructor from a constructor
        this("hello","56",40);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", marks=" + marks +
                '}';
    }
}
