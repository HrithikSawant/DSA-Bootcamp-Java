package com.conditionsandloops;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
        Syntax : for loop
        for(initialisation;condition;increment/decrement){
            //body
         }
         */
        //Q : print numner from 1 to 5
        for (int num = 1; num<=5; num += 1){
            System.out.println(num);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //Q: print number from 1 to n
        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

        /*
        Syntax : while loop
        while (condition){
            //body
            }
         */
        int num = 1;
        while(num<=5){
            System.out.print(num);
            num++;
        }

         /*
        Syntax : do while loop
        do {

        }
        while (condition);
         */
        int reverse = 10;
        do{
            System.out.println(reverse);
            reverse--;
        }while (reverse != 0);

    }
}
