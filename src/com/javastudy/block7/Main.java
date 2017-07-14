package com.javastudy.block7;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        // TASK #1
        System.out.println("TASK #1");
        String[] product = {"хлеб", "молоко", "сахар", "мука", "овсянка", "йогурт", "шоколад", "печенье", "бананы", "чай"};
        double[] price = {6, 15, 22.23, 30.09, 20, 5.95, 22, 7.50, 27, 30};

        Task1 t1 = new Task1();
        t1.buildList(product, price);
        System.out.println();


        // TASK #2
        System.out.println("TASK #2");
        double[] a = {12, 10, 15, 17, 11, 13, 18, 14, 19, 16};
        double[] b = {31, 38, 33, 37, 32, 40, 39, 34, 30, 35};

        Task2 t2 = new Task2();
        t2.pifagorMethod(a, b);
        System.out.println();
    }

}
