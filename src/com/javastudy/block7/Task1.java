package com.javastudy.block7;

public class Task1 {

    public double getAverSumm (double[] d) {
        double summ = 0.0;

        for (int i = 0; i < d.length; i++) {
            summ += d[i];
        }

        summ /= d.length;

        return summ;
    }

    public void buildList (String[] pro, double[] pri) {
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
