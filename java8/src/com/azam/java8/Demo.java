package com.azam.java8;

public class Demo {
    private static final int MAX = 100;
    private final int min = 10;

    private Demo() {
        System.out.println("This is private Constructor()");
    }
    private static void m1() {
        System.out.println("This is private static method m1()");
    }
    private void m2() {
        System.out.println("This is private non-static method m2()");
    }

    @Override
    public String toString() {
        return "Demo{" +
                "MAX=" + MAX +
                ", min=" + min +
                '}';
    }
}
