package com.javastudy.block4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        CountObject co1 = new CountObject();
        CountObject co2 = new CountObject();
        CountObject co3 = new CountObject();
        CountObject co4 = new CountObject();
        CountObject co5 = new CountObject();

        System.out.println("Objects were created: " + CountObject.getCountObj());

        System.out.println();
        System.out.println("////////////////////////////////////////////////////////");
        System.out.println();

        //TestOne
        System.out.println("------------------ [FIRST OBJECT] ----------------------");
        System.out.println("[LOG IN CONSOLE]");
        TestOne to1;
        to1 = new TestOne();

        System.out.println("--------------------------------------------------------");
        System.out.println("[OUTPUT IN CONSOLE]");

        int a = to1.getA();
        System.out.println("Value of field static 'a' : " + a);
        to1.setA(2000);
        System.out.println("Value of field static 'a' was changed. And now it's: " + to1.getA());
        System.out.println("------------------ [END FIRST OBJECT] ------------------");

        System.out.println(); //Space after first object
        System.out.println("-------------------- [SECOND OBJECT] -------------------");
        System.out.println("[LOG IN CONSOLE]");
        TestOne to2 = new TestOne();
        System.out.println("--------------------------------------------------------");
        System.out.println("[OUTPUT IN CONSOLE]");
        System.out.println("Value of field static 'a' : " + to2.getA());
        to2.setA(3000);
        System.out.println("Value of field static 'a' was changed. And now it's: " + to2.getA());
        System.out.println("------------------ [END SECOND OBJECT] -----------------");

        System.out.println(); //Space after first object
        System.out.println("-------------------- [THIRD OBJECT] --------------------");
        System.out.println("[OUTPUT IN CONSOLE]");
        TestOne to3 = new TestOne();
        System.out.println("--------------------------------------------------------");
        System.out.println("Value of field static 'a' : " + to3.getA());
        System.out.println("------------------ [END THIRD OBJECT] ------------------");

        System.out.println();
        System.out.println();
        System.out.println("########################################################");
        System.out.println(to1.getA());

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////");

//        Я не знаю почему, но оно работает:) если кто поймет, напишите мне на how@gmail.com
//        TestSingle single = null;
//        single.say();

        TestSingle single = TestSingle.s;
        single.say();
    }
}
