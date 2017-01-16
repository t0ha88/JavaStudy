package com.javastudy.block3;

public class Rectangle {
    //длина стороны a1 и b1
    private int a1;
    private int b1;
    private float a1f;
    private float b1f;

    //конструктор для инициализации длины при создании объекта
    public Rectangle(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

//    public Rectangle(float a1f, int b1f) {
//        this.a1f = a1f;
//        this.b1f = b1f;
//    }

    public int areaRectangle(){
        int s = a1 * b1;
        return s;
    }

    public void equalRectangle(int r1s, int r2s) {
        if (r1s == r2s) {
            System.out.println("Площадь прямоугольника 1 равна прямоугольнику 2.");
        } else {
            System.out.println("Площадь прямоугольников не равна.");
        }
    }
}
