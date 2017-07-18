package com.javastudy.block7;

public class Task3 {


//    @Override
//    public boolean equals(Object obj) {
//        return;
//    }

    // Get articul name for given price
    public void getForGivenPrice (String[] p, double[] pP, double price) {
        for (int i = 0; i < pP.length; i++) {

            if (pP[i] == price) {
                System.out.println(p[i] + "  " + pP[i]);
            }
        }
    }

    // Get from to from
    public void getFromtoToFrom (String[] p, double[] pP, double startPrice, double endPrice) {
        for (int i = 0; i < pP.length; i++) {
            if (pP[i] >= startPrice && pP[i] <= endPrice) {
                System.out.println(p[i] + "  " + pP[i]);
            }
        }
    }

    // Get articul price for given name
    public void getForGivenName (String[] p, double[] pP, String nameProduct) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].equals(nameProduct)) {
                System.out.println(p[i] + "  " + pP[i]);
            }
        }
    }

    public void getForGivenLetter (String[] p, double[] pP, char letter) {
        int summ = 0;
        for (int i = 0; i < p.length; i++) {
            char cLetter = p[i].charAt(0);
            if (cLetter == letter) {
                System.out.println(p[i] + "  " + pP[i]);
                summ++;
            }
        }

        if (summ == 0) {
            System.out.println("Такого товара нет в списке");
        }
    }

}
