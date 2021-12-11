package com.assignment.functions;

import java.util.Scanner;

public class Grade {
    //Write a program that will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered as below:

    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks out of 100 :");
        int marks = sc.nextInt();

        findGrade(marks);
    }
    static void findGrade(int marks){

        if(marks>100 || marks<0){
            System.out.println("Enter valid marks");
        }else{
            String grade = null;
            if(marks>=91 && marks<=100){
                grade ="AA";
            }else if(marks>=81 && marks<=90){
                grade ="AB";
            }else if(marks>=71 && marks<=80){
                grade ="BB";
            }else if(marks>=61 && marks<=70){
                grade ="BC";
            }else if(marks>=51 && marks<=60){
                grade ="CD";
            }else if(marks>=41 && marks<=50){
                grade ="CC";
            }else if(marks <=40){
                grade = "Fail";
            }
            System.out.println("Grade :"+grade);
        }
    }
}
