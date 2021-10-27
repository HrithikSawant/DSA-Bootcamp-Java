package com.conditionsandloops;

public class condition {
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolean expression T or F) {
            //body
        } else {
           //do this
        }
         */

        int salary = 24500;
//        if(salary>10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
        //multiple if else statement

        if(salary >10000){
            salary += 3000;
        } else if(salary > 20000){
            salary += 4000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);



    }
}
