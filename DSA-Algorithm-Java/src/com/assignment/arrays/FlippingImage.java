package com.assignment.arrays;

import java.util.Arrays;

public class FlippingImage {
    //https://leetcode.com/problems/flipping-an-image/
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {1, 0, 1, 0}};

        int[][] result = flipAndInvertImage(image);
        //output
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }

    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int row = 0; row < image.length; row++) {
            int start = 0;
            int end = image[row].length - 1;
            //flipping horizontally
            swap(image, start, end, row);
        }

        invert(image);

        return image;
    }

    static void swap(int[][] image, int start, int end, int row) {

        while (start < end) {
            int temp = image[row][start];
            image[row][start] = image[row][end];
            image[row][end] = temp;
            start++;
            end--;

        }
    }

    static void invert(int[][] image){
        //inverting
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                if (image[row][col] == 1) {
                    image[row][col] = 0;
                } else {
                    image[row][col] = 1;
                }
            }
        }
    }

}
