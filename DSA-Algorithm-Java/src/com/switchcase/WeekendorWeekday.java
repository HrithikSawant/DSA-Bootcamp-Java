package com.switchcase;

import java.util.Scanner;

public class WeekendorWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 7:
            case 8:
                System.out.println("Weekend");
            default:
                System.out.println("Not a proper input");
        }
    }
}
