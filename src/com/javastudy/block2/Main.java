package com.javastudy.block2;

public class Main {

    public static void main(String[] args) {
//        Integer a = 120;
//        Integer b = 120;
//        Integer c = 127;
//        Integer d = 127;
//
//        System.out.println(a==b);
//        System.out.println(c==d);

//        int x = 1000000000;
//        int y = 2000000000;
//        long z = x + y;
//        System.out.println(z);

        byte a = 40, b = 50;
        byte sum = (byte) (a + b);
        System.out.println(sum);



//        int passing = 3;
//        Receiving (passing);
//        System.out.println(passing);
    }

    public static void Receiving(int var) {
        var = var + 2;
        System.out.println(var);
    }

}
