package com.javastudy.block6;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle("First");
        Triangle triangle2 = new Triangle("Second");
        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());

        // #--------------------------------------------------#

        Triangle triangle3 = new Triangle(10,10,10);
        Triangle triangle4 = new Triangle(10,10,10);


//        System.out.println(triangle3.equals(triangle4));



        System.out.println(triangle3.hashCode());
        System.out.println(triangle4.hashCode());

        System.out.println(triangle3.equals(triangle4));
        System.out.println(triangle4.equals(null));
    }
}
