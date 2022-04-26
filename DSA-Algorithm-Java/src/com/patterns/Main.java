package com.patterns;

public class Main {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(4);
//        pattern3(4);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
        pattern9(5);
    }
    public static void pattern1(int n){
        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }
    public static void pattern3(int n){

        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int row = 0; row <= n; row++){
            for(int col = 1;col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int row = 0; row < n*2; row++){

            int totalcolInRows = row > n ? 2 * n - row : row;

            for(int col = 0;col < totalcolInRows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern6(int n){
        for(int row = 0; row < n*2; row++){
            int totalcolInRows = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalcolInRows;
            for (int s = 0;s < noOfSpaces;s++){
                System.out.print(" ");
            }


            for(int col = 0;col < totalcolInRows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int row = 0; row < n*2; row++){
            int totalcolInRows = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalcolInRows;
            for (int s = 0;s < noOfSpaces;s++){
                System.out.print("  "); //double space
            }


            for(int col = 0;col < totalcolInRows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int row = 1; row <= n; row++){

            for(int col = 1;col <= row; col++){
                if((row+col)%2==1){
                    System.out.print(" 0");
                }
                else{
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int row = 1; row <= n; row++){

            for (int s = 0;s < n - row;s++){
                System.out.print("  "); //double space
            }

            for(int col = row; col>=1 ;col--){
                System.out.print(col+" ");
            }

            for(int col = 2; col <= row ;col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }




}
