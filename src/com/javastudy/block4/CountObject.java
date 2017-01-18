package com.javastudy.block4;

public class CountObject {
    static private int countObj = 0;

    CountObject() {
        countObj += 1;
    }

    public static int getCountObj() {
        return countObj;
    }
}
