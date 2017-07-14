package com.javastudy.block7;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        // TASK #1
        String[] product = {"хлеб", "молоко", "сахар", "мука", "овсянка", "йогурт", "шоколад", "печенье", "бананы", "чай"};
        double[] price = {6, 15, 22.23, 30.09, 20, 5.95, 22, 7.50, 27, 30};

        Task1 t1 = new Task1();
        t1.buildList(product, price);

    }

}
