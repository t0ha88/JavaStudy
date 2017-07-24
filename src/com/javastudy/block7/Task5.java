package com.javastudy.block7;

public class Task5 {

    String[] kirilicAlphabet = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и",
            "й", "к", "л", "м", "н", "о", "п", "р", "с", "т",
            "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь",
            "э", "ю", "я"};

    String[] latinAlphabet = {"a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i",
            "j", "k", "l", "m", "n", "o", "p", "r", "s", "t",
            "u", "f", "x", "c", "ch", "sh", "shh", "''", "y'", "'",
            "e'", "yu", "ya"};

    // Transfer Kirilic to Latin
    public void transferKirilicToLatin (String s) {

        StringBuilder sb = new StringBuilder();
        final String space = " ";
        String str = s.trim().toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char l = str.charAt(i);
            String lToString = Character.toString(l);

                for(int j = 0; j < 32; j++) {
                    if(lToString.equals(kirilicAlphabet[j])) {
                        sb.append(latinAlphabet[j]);
                    } else if (lToString.equals(" ")) {
                        sb.append(space);
                        break;
                    }
                }
        }
        System.out.println(sb.toString());
    }

    // Transfer Latin to Kirilic
    public void transferLatinToKirilic (String s) {
        String str = s.trim().toLowerCase();
        StringBuilder sb = new StringBuilder();
        final String space = " ";

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            String lToString = Character.toString(c);

            for (int j = 0; j < 32; j++) {
                if (lToString.equals(latinAlphabet[j])) {
                    sb.append(kirilicAlphabet[j]);
                } else if (lToString.equals(" ")) {
                    sb.append(space);
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }

}
