package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(2,3,4,5,6,8);
        multiple(12,15,"hrithik","Sawant");
    }
    static  void multiple(int a,int b,String ...v){
        int sum = a +b;
        System.out.println(sum);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
