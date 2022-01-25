package com.oops.staticeExample;

//outside classes cannot be static
public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Hrithik");
        Test b = new Test("Hr");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
