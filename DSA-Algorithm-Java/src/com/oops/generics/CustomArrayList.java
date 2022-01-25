package com.oops.generics;

import java.util.Arrays;

public class CustomArrayList {

     private int[] data;
     private static int DEFAULT_SIZE = 10;
     private int size = 0; //also working as index value

    public CustomArrayList() {
         this.data = new int[DEFAULT_SIZE];
     }

     public void add(int num){
         if(isFull()){
             resize();
         }
         data[size++] = num;
     }

    private void resize() {
         int[] temp = new int[data.length * 2];

         //copy the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    //this would remove last index
    private int remove(){
        if(isHalf()){
            shrink();
        }
        int removed = data[--size];
        return removed;
    }

    private boolean isHalf() {
        return data.length / 2 == size;
    }

    private void shrink() {
        int[] temp = new int[data.length / 2];
        for (int i = 0;i < size - 1; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int get(int index){
         return data[index];
    }

    public int size(){
         return size;
    }

    public void set(int index,int value){
         data[index] = value;
    }

    private boolean isFull() {
         return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

//    @Override
//    public String toString() {
//        int[] temp = new int[size];
//        for (int i = 0; i < size; i++) {
//            temp[i] = data[i];
//        }
//        return Arrays.toString(temp);
//    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
    }
}
