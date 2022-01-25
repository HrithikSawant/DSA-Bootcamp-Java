package com.oops.generics;

import java.util.Arrays;

public class WildCardExample<T extends Number> {

     private Object[] data;
     private static int DEFAULT_SIZE = 10;
     private int size = 0; //also working as index value

    public WildCardExample() {
         this.data = new Object[DEFAULT_SIZE];
     }

     public void add(T num){
         if(isFull()){
             resize();
         }
         data[size++] = num;
     }

    private void resize() {
         Object[] temp = new Object[data.length * 2];
         //copy the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    //this would remove last index
    private T remove(){
        if(isHalf()){
            shrink();
        }
        T removed = (T)(data[--size]);
        return removed;
    }

    private boolean isHalf() {
        return data.length / 2 == size;
    }

    private void shrink() {
        Object[] temp = new Object[data.length / 2];
        for (int i = 0;i < size - 1; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T get(int index){
         return (T)data[index];
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
        WildCardExample list = new WildCardExample();
        list.add(3);
        System.out.println(list);
    }
}
