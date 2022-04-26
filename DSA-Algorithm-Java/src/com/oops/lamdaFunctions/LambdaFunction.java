package com.oops.lamdaFunctions;

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        arr.forEach((item) -> { System.out.println(item * 2);});

        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;

        LambdaFunction fun = new LambdaFunction();
        System.out.println(fun.operate(5,3,sum));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
    int sum (int a , int b){
        return a+b;
    }
}

interface Operation{
    int operation(int a,int b);
}
