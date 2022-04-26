package com.oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student hrithik = new Student(8,88.88f);
        Student adam = new Student(5,99.52f);
        Student cloe = new Student(4,78.85f);
        Student ted = new Student(2,90.32f);
        Student smith  = new Student(1,92.45f);

        Student[] list = {hrithik,cloe,ted,smith,adam};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int diff = (int)(o1.rollno - o2.rollno);

                //if diff == 0 ; means both are equal
                // diff < 0: means o is bigger else o is smaller
                return diff;
            }
        });
        System.out.println(Arrays.toString(list));
//
//        if(cloe.compareTo(hrithik) < 0){
//            System.out.println(cloe.compareTo(hrithik));
//            System.out.println("rith has more masks");
//        }


    }
}
