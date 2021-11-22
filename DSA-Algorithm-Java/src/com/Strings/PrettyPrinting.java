package com.Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted number is %.2f",a);
        float b = 453.1274f;
        System.out.printf("\nFormatted number is %.2f",b);

        //Pretty printing Pie
        System.out.printf("\nPie : %.3f",Math.PI);

        System.out.printf("\nHello my name is %s and I am %s","Hrithik","Cool");

    }
}
