package com.javastudy.block6;

public class Triangle {

    private String nameTriangle;
    private int a;
    private int b;
    private int c;


    /* | Constructor | */
    public Triangle (String nameTriangle) {
        this.nameTriangle = nameTriangle;
    }

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    /* | Getter & Setter | */
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


    /* | Size Area | */
    public double getSizeArea() {
        // S=(Square) p * (p-a) * (p-b) * (p-c)
        // p = (a + b + c) / 2
        int p = (a + b + c) / 2;
        int S = p * (p-a) * (p-b) * (p-c);
        double sSqrt = Math.sqrt(S);
        return sSqrt;
    }


    /* | Override toString(), equals(Object obj), hashCode() | */
    @Override
    public String toString () {
        return "Triangle is figure, and we have " + nameTriangle + " triangle!";
    }


    @Override
    public boolean equals (Object obj) {
        // Check is this object
        if (this == obj) {
            return true;
        }

        // Check is Object obj == null
        if (obj == null) {
            return false;
        }

        // Check is this different classes
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        // Make from Object to Triangle
        Triangle tri = (Triangle) obj;

        // Check value
        return (this.getA() == tri.getA() &&
                this.getB() == tri.getB() &&
                this.getC() == tri.getC());




    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        result = prime * result + c;
        return result;

    }
}
