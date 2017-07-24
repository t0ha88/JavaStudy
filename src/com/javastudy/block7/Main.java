package com.javastudy.block7;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

//        // TASK #1
//        System.out.println("TASK #1");
//        String[] product = {"хлеб", "молоко", "сахар", "мука", "овсянка", "йогурт", "шоколад", "печенье", "бананы", "чай"};
//        double[] price = {6, 15, 22.23, 30.09, 20, 5.95, 22, 7.50, 27, 30};
//
//        Task1 t1 = new Task1();
//        t1.buildList(product, price);
//        System.out.println();
//
//
//        // TASK #2
//        System.out.println("TASK #2");
//        double[] a = {12, 10, 15, 17, 11, 13, 18, 14, 19, 16};
//        double[] b = {31, 38, 33, 37, 32, 40, 39, 34, 30, 35};
//
//        Task2 t2 = new Task2();
//        t2.pifagorMethod(a, b);
//        System.out.println();
//
//
//        // TASK #3
//        System.out.println("TASK #3");
//        String[] products = {"Абрикос", "Ананас", "Вишня", "Слива", "Алыча", "Яблоко", "Черешня", "Персик", "Банан",
//                "Арбуз", "Дыня", "Инжир", "Груша", "Клубника", "Кукуруза"};
//        double[] priceProducts = {25, 40, 22, 16, 12, 10, 26, 36, 27, 15, 25, 49, 23, 38, 25};
//
//        Task3 t3 = new Task3();
//        System.out.println("|################ - Query 1 - ###############|");
//        t3.getForGivenPrice(products, priceProducts, 25);
//
//        System.out.println();
//        System.out.println("|################ - Query 2 - ###############|");
//
//        t3.getFromtoToFrom(products, priceProducts, 0,25);
//
//        System.out.println();
//        System.out.println("|################ - Query 3 - ###############|");
//
//        t3.getForGivenName(products, priceProducts, "Клубника");
//
//        System.out.println();
//        System.out.println("|################ - Query 4 - ###############|");
//
//        t3.getForGivenLetter(products, priceProducts, 'Б');


        // TASK #4
        System.out.println("TASK #4");
        String[] otherText = {"Антон", "Анна", "Женя", "Таня", "Потоп", "Комод", "Сергей", "Дед", "Анатолий", "Шалаш",
                "Тут", "Марго", "Мадам"};

        Task4 t4 = new Task4();
        t4.checkPalindrom(otherText);


        // TASK #5
        System.out.println("TASK #5");

        Task5 t5 = new Task5();

        String sKirilic = "Привет как твои дела это Антон";
        String sLatin = "Privet kak tvoi dela eto Anton";

        t5.transferKirilicToLatin(sKirilic);
        t5.transferLatinToKirilic(sLatin);

    }

}
