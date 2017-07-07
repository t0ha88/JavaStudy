package com.javastudy.block6;

public class Triangle {
    private String nameTriangle;
    private int a;
    private int b;
    private int c;

    // Start Constructor
    public Triangle (String nameTriangle) {
        this.nameTriangle = nameTriangle;
    }

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    // End Constructor


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getSizeArea() {
        // S=(Square) p * (p-a) * (p-b) * (p-c)
        // p = (a + b + c) / 2
        int p = (a + b + c) / 2;
        int S = p * (p-a) * (p-b) * (p-c);
        double sSqrt = Math.sqrt(S);
        return sSqrt;
    }

    @Override
    public String toString () {
        return "Triangle is figure, and we have " + nameTriangle + " triangle!";
    }

    @Override
    public boolean equals (Object obj1) {
        Triangle tR2 = (Triangle) obj1; // I DO NOT KNOW HOW IS IT WORK!!!!!
        if (this == obj1 && obj1 == this) {
            return true;
        }

        if (this == null || this.getClass() != tR2.getClass()) {
            return false;
        }

        return this.getA() == ((Triangle) obj1).getA() && this.getB() == ((Triangle) obj1).getB()
                && this.getC() == ((Triangle) obj1).getC();


    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        int summ = a + b + c;
        return result = prime * result + summ;
    }
}
