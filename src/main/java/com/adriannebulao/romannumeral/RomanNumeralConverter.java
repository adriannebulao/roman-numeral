package com.adriannebulao.romannumeral;

public class RomanNumeralConverter {
    public String integerToRomanConverter(int num) {
        if (num < 1) {
            throw new NumberFormatException("Value of num must be positive.");
        }
        if (num > 3999) {
            throw new NumberFormatException("Value of num must be 3999 or less.");
        }

        StringBuilder romanNumeral = new StringBuilder("");

        for (int i = 0; i < num; i++) {
            romanNumeral.append("I");
        }

        final String[] from = {"IIIII", "IIII", "VV", "VIV", "XXXXX", "XXXX", "LL", "LXL", "CCCCC", "CCCC", "DD", "DCD"};
        final String[] to = {"V", "IV", "X", "IX", "L", "XL", "C", "XC", "D", "CD", "M", "CM"};

        for (int i = 0; i < from.length; i++) {
            romanNumeral = replaceAll(romanNumeral, from[i], to[i]);
        }

        return romanNumeral.toString();
    }

    public StringBuilder replaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while(index != -1) {
            builder.replace(index, index + from.length(), to);
            index += to.length();
            index = builder.indexOf(from, index);
        }
        return builder;
    }


//    public String integerToRomanConverter(int num) {
//        if (num < 1) {
//            throw new NumberFormatException("Value of num must be positive.");
//        }
//        if (num > 3999) {
//            throw new NumberFormatException("Value of num must be 3999 or less.");
//        }
//
//        return "I".repeat(num)
//                .replace("IIIII", "V")
//                .replace("IIII", "IV")
//                .replace("VV", "X")
//                .replace("VIV", "IX")
//                .replace("XXXXX", "L")
//                .replace("XXXX", "XL")
//                .replace("LL", "C")
//                .replace("LXL", "XC")
//                .replace("CCCCC", "D")
//                .replace("CCCC", "CD")
//                .replace("DD", "M")
//                .replace("DCD", "CM");
//    }


}
