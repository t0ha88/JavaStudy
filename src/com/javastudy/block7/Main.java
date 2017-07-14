package com.javastudy.block7;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String[] product = {"хлеб", "молоко", "сахар", "мука", "овсянка", "йогурт", "шоколад", "печенье", "бананы", "чай"};
        double[] price = {6, 15, 22.23, 30.09, 20, 5.95, 22, 7.50, 27, 30};

        buildList(product, price);




    }

    public static double getAverSumm (double[] d) {
        double summ = 0.0;

        for (int i = 0; i < d.length; i++) {
            summ += d[i];
        }

        summ = summ / d.length;

        return summ;
    }

    public static void buildList (String[] pro, double[] pri) {
        int number = 1;
        for (int i = 0; i < pro.length; i++) {

            StringBuilder builder = new StringBuilder();

            if (number < 10) {
                int lengtString = pro[i].length();
                int space = 10 - lengtString;
                    for (int j = 0; j < space; j++) {
                        builder.append(" ");
                    }
                String spaceN = builder.toString();

                System.out.println(number + "   |   " + pro[i]  + spaceN + "|   " + pri[i]);
            } else {
                int lengtString = pro[i].length();
                int space = 10 - lengtString;
                    for (int j = 0; j < space; j++) {
                        builder.append(" ");
                    }
                String spaceN = builder.toString();
                System.out.println(number + "  |   " + pro[i] + spaceN + "|   " + pri[i]);
            }

            number++;
        }
        System.out.println();
        System.out.println("Средняя цена товаров = " + getAverSumm(pri));


    }

}
