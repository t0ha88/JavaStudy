package com.javastudy.block5;

public class CompareStrings {
    private String s1;
    private String s2;

    public CompareStrings(){}

    public CompareStrings(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void compareStrings(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        String sModif1 = lowerString(this.s1);
        String sModif2 = lowerString(this.s2);

        if(sModif1.equals(sModif2)) {
            System.out.println("Строки одинаковые");
        } else {
            System.out.println("Строки разные");
        }
    }

    private String lowerString(String str) {
        str = str.trim().toLowerCase();
        return str;
    }
}
