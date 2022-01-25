package com.oops.introduction;

public class Main {
    public static void main(String[] args) {;


        Student student1 = new Student("Hrithik","TCS84",14);
        Student student2 = new Student("Hrithik2","TCS84",14);

        System.out.println(student1);
        System.out.println(student2);


        Student student3 = new Student(student2);
        System.out.println(student3);

//        Student student2 = new Student(student1);
//
//        Student student3 = new Student();
//
//        System.out.println(student3);
//        student2.greeting();


    }

}
