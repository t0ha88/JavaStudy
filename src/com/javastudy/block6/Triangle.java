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
        Triangle objInside = (Triangle) obj;
        if (obj == null || this.getClass() != objInside.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        return (this.getSizeArea() == objInside.getSizeArea());


//        // reflexive
//        System.out.println("reflexive");
//        if (this.equals(objInside))
//            return true;
//
//
//        // symmetric
//        System.out.println("symmetric");
//        if ((this.getA() == objInside.getB())
//                && (objInside.getB() == this.getA()));
//        else
//            return false;
//
//
//
//        // transitive
//        System.out.println("transitive");
//        if (this.getA() == objInside.getA()
//                && this.getB() == objInside.getB()
//                && this.getC() == objInside.getC());
//        else
//            return false;
//
//
//
////        // consistent
////        System.out.println("consistent");
////        return this.getSizeArea() == objInside.getSizeArea();
//
//
//
//        // consistent & not null
//        System.out.println("consistent & not null");
//        if ((this.equals(null)) || this.getClass() != objInside.getClass());
//        return false;


//        if (this != null && this.getClass() == objInside.getClass()) {
//            return this.equals(objInside) && this.getSizeArea() == objInside.getSizeArea();
//        }
//            return false;


//        /* | OLD REALIZATION| */
//        Triangle tR2 = (Triangle) obj1; // I DO NOT KNOW HOW IS IT WORK!!!!!
//        if (this == obj1 && obj1 == this) {
//            return true;
//        }
//
//        if (this == null || this.getClass() != tR2.getClass()) {
//            return false;
//        }
//
//        return this.getA() == ((Triangle) obj1).getA() && this.getB() == ((Triangle) obj1).getB()
//                && this.getC() == ((Triangle) obj1).getC();


    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        int summ = a + b + c;
        return result = prime * result + summ;
    }
}
