package com.javastudy.block7;

public class Task2 {

    public void pifagorMethod(double[] a, double[] b) {
        double[] c = new double[10];

        System.out.println("a          " + "b          " + "c ");

        for (int i = 0; i < c.length; i++) {
//            double aDoub = (double) a[i];
//            double bDoub = (double) b[i];
            double summ = (Math.pow(a[i], 2)) + (Math.pow(b[i], 2));
            summ = Math.sqrt(summ);
            c[i] = summ;
            System.out.println(a[i] + "       " + b[i] + "       " + c[i]);
        }
    }
}
