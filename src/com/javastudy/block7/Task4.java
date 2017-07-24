package com.javastudy.block7;

public class Task4 {

    public void checkPalindrom (String[] s) {
        for(int i = 0; i < s.length; i++) {
            String t = s[i].trim().toLowerCase();
            String tR = new StringBuilder(t).reverse().toString();
            if (t.equals(tR)) {
                System.out.println(s[i] + " - является палиндромом.");
            }
        }
    }

}
