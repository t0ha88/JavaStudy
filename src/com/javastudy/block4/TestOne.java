package com.javastudy.block4;

public class TestOne {
    public static int a = 1;
    private int b;

    {
        System.out.println("non a static block has been initialized");
    }

    static {
        System.out.println("a static bloc has been initialized");
        System.out.println("Static field a: " + a);
    }

    public TestOne() {
        System.out.println("constructor was activated");
    }

    public int getA() {
        return a;
    }

    public static void setA(int a) {
        TestOne.a = a;
    }
}