package com.switchcase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID){
            case 1:
                System.out.println("Hrithik Sawant");
                break;
            case 2:
                System.out.println("Learn");
                break;
            case 3:
                System.out.println("Emp ID 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CS":
                        System.out.println("Computer Science");
                        break;
                    case "Bio":
                        System.out.println("Biology Department");
                        break;
                    default:
                        System.out.printf("Not a Department");
                        break;
                }
                break;
            default:
                System.out.println("Enter Correct a ID");
        }
    }
}
