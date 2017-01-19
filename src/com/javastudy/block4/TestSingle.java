package com.javastudy.block4;

import com.sun.corba.se.impl.orb.ParserTable;

public class TestSingle {
    public static TestSingle s;

    static {
        s = new TestSingle();
    }

    private TestSingle(){}

    public static void say() {
        System.out.println("Sya hello.........");
    }
}
