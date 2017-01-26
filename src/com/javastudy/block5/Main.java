package com.javastudy.block5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String str = "Последний символ в этой строке - оA";
//        int last = str.length()-1;//длина строки - 1, так как отсчет начинается с 0
//        char ch = str.charAt(last - 5);
//        System.out.println(ch);

//        String s = "test";
//        String so = new String("tEst");
//
//        boolean res = s.equals(so);
//        System.out.println(res);
//
//        String t = s.concat(so);
//        System.out.println(t);

//        /* Конкатенация с помощью .concat(String str) */
//        String[] animals = {"Собака", "Кот"}; // массив строк 1
//        String[] foods = {"Чапи", "Вискас"}; // массив строк 2
//
//        // составления строк из строк массива и доп. слова
//        String result1 = animals[0].concat(" ест ").concat(foods[0]);
//        String result2 = animals[1].concat(" ест ").concat(foods[1]);
//
//        // вывод на консоль
//        System.out.println(result1);
//        System.out.println(result2);
//
//        /* Определение количество символов в строке с помощью int length() */
//        String str = "Строка из букв, цифр 562 и специальных символов %*;№?";
//        int lengthStr = str.length();
//        System.out.println("Длина строки " + lengthStr);
//
//        /* Извлечение подстроки из строки substring() */
//        String s = "www.mysite.com";
//        String name = s.substring(4, s.length()- 4);
//        System.out.println(name);
//
//        // или
//
//        String domain = s.substring(4);
//        System.out.println(domain);
//
//        //////////////////////////////////
//
//        String replaceStr = "Антон Кулиш";
//        String strRe = replaceStr.replace();
//        System.out.println(strRe);

        /* Delete Char from text */
        System.out.println("Delete Char from text");
        System.out.println("----------------------------------------------------");

        DeleteChar dl = new DeleteChar();
        System.out.println("Введите текст: ");
        String text = in.nextLine();
        System.out.println("Введите символ(ы) который нужно удалить: ");
        String letter = in.nextLine();

        System.out.println(dl.deleteChar(text, letter, ""));

        /* Compare Strings without space and register of symbol */
        System.out.println("Compare Strings without space and register of symbol");
        System.out.println("----------------------------------------------------");
        System.out.println("Введите первое предложение(строку): ");
        String s1 = in.nextLine();
        System.out.println("Введите второе предложение(строку): ");
        String s2 = in.nextLine();

        CompareStrings cs = new CompareStrings();
        cs.compareStrings(s1, s2);

    }
}
